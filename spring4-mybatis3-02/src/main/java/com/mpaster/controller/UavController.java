package com.mpaster.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mpaster.model.Uav;
import com.mpaster.service.IUavService;

@Controller
@RequestMapping("/uav")
public class UavController {

	@Resource
	private IUavService uavService;
	
	/**
	 * 跳转至新增界面
	 * @param uav
	 * @return
	 */
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ModelAndView addUav(Uav uav){
		return new ModelAndView("/uav/addUav");
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public ModelAndView processNewUav(Uav uav){
		ModelAndView mv = new ModelAndView();
		String index = "redirect:/uav/failure";
		if(uav != null){
			uav.setUavCreateTime(new Date());
			uav.setUavDelFlag(0);
			uavService.addUav(uav);
			
			index = "redirect:/uav/success";
			mv.setViewName(index);
		}
		return mv;
	}
	
	@RequestMapping(value="/failure")
	public ModelAndView addUavFailure(){
		return new ModelAndView("/uav/failure");
	}
	
	@RequestMapping(value="/success")
	public ModelAndView addUavSuccess(){
		return new ModelAndView("/uav/success");
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView getUav(@PathVariable("id")Integer id, ModelMap map){
		Uav uav = this.uavService.getUav(id);
		map.put("uav", uav);
		return new ModelAndView("/uav/details");
	}
}
