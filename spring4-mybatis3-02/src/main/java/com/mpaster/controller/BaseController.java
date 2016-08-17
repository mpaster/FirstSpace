package com.mpaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mpaster.model.Message;
import com.mpaster.model.Uav;
import com.mpaster.model.User;
import com.mpaster.service.IMessageService;
import com.mpaster.service.IUavService;
import com.mpaster.service.IUserService;

/**
 * 由 索引页（站点首页） 跳转到 办款首页
 * @author Administrator
 *
 */
@Controller
public class BaseController {

	@Resource
	private IUavService uavService;
	
	@Resource
	private IUserService userService;
	
	@Autowired
	private IMessageService messageService;
	
	/**
	 * 跳转至 无人机版块首页
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/uav", method=RequestMethod.GET)
	public ModelAndView toUav(Model model){
		List<Uav> uavs = new ArrayList<Uav>();
		uavs = this.uavService.getAll();
		model.addAttribute("uavs", uavs);
		return new ModelAndView("/uav");
	}
	
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public ModelAndView toMesge(Model model){
		List<Message> mesges = new ArrayList<Message>();
		mesges = this.messageService.getAll();
		model.addAttribute("mesges", mesges);
		return new ModelAndView("/message");
	}
	
	// 在拦截器中，判断，是否是管理员账户，如果是管理员
	/**
	 * 管理员-管理用户
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public ModelAndView toUsers(Model model){
		List<User> users = new ArrayList<User>();
		users = this.userService.getAll();
		model.addAttribute("users", users);
		return new ModelAndView("/users");
	}
	
	/**
	 * 管理员-管理无人机
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/uavs", method=RequestMethod.GET)
	public ModelAndView toUavs(Model model){
		List<Uav> uavs = new ArrayList<Uav>();
		uavs = this.uavService.getAll();
		model.addAttribute("uavs", uavs);
		return new ModelAndView("/uavs");
	}
	
}
