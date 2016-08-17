package com.mpaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mpaster.model.User;
import com.mpaster.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getUser(@PathVariable("id")Integer id, Model model){
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "success";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String addUser(User user){
		if(user != null){
			userService.addUser(user);
		}
		return "success";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable("id")Integer id){
		if(id != null){
			userService.deleteUser(id);
		}
		return "success";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public String updateUser(@PathVariable("id")Integer id, User user){
		if(user != null){
			userService.updateUser(user);
		}
		return "success";
	}
	
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	public String getAllUser(Model model){
		List<User> users = new ArrayList<User>();
		users = userService.getAll();
		model.addAttribute("users", users);
		return "success";
	}
}
