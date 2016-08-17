package com.mpaster.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mpaster.model.Message;
import com.mpaster.service.IMessageService;

/**
 * 普通用户提交公共留言
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private IMessageService messageService;
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String toAddMesge(){
		return "/mesge/addMessage";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public ModelAndView processNewMesge(Message mesge){
		ModelAndView mv = new ModelAndView();
		String index = "redirect:/message/failure";
		if(mesge != null){
			mesge.setMesgeCreateTime(new Date());
			mesge.setMesgeDelFlag(0);
			messageService.addMessage(mesge);
			
			index = "redirect:/message/success";
			mv.setViewName(index);
		}
		return mv;
	}
	
	@RequestMapping(value="/success")
	public String toAddMesgeSuccess(){
		return "/mesge/success";
	}
	
	@RequestMapping(value="/failure")
	public String toAddMesgeFailure(){
		return "/mesge/failure";
	}
	
}
