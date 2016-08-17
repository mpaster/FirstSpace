package com.mpaster.controller.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mpaster.model.User;
import com.mpaster.service.IUserService;

/**
 * 管理员 - 管理用户的控制类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/users")
public class UsersController {

	@Resource
	private IUserService userService;
	
	/**
	 * 跳转至添加用户界面
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String toAddUser(){
		return "/users/addUser";
	}
	
	@RequestMapping(value="/new/process", method=RequestMethod.POST)
	public String processAddUser(User user){
		String index = "redirect:/users/new/failure";
		if(user != null){
			this.userService.addUser(user);
			index = "redirect:/users/new/success"; // 重定向到一个请求，避免表单重复提交
		}
		return index;
	}
	
	@RequestMapping(value="/new/success")
	public String toAddSuccess(){
		return "users/success";
	}
	
	@RequestMapping(value="/new/failure")
	public String toAddFailure(){
		return "users/failure";
	}
	
	/**
	 * 删除操作
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable("id")Integer id, ModelMap model){
		if(id != null){
			this.userService.deleteUser(id);
			model.put("msg", "删除成功");
		}else{
			model.put("msg", "删除失败");
		}
		return "redirect:/users";
	}
}
