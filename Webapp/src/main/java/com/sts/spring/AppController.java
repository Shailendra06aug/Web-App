package com.sts.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping("/regform")
	public String register() {
		
		return"registration";
	}
	
	
	@RequestMapping("/userData")
	public ModelAndView userinfo(Registration reg) {
//		System.out.println("i am loading  "+reg.getUname());
		ModelMap model= new ModelMap();
		model.addAttribute("name", reg.getUname());
		model.addAttribute("Email", reg.getEmailId());
		model.addAttribute("passward", reg.getPassword());
		model.addAttribute("gender", reg.getGender()== Integer.parseInt("1") ? "Male" : "Female");
		model.addAttribute("hobby", reg.getHobby());
		
		ModelAndView mv= new ModelAndView("user-details");
		mv.addObject("regobj", model);
		
		return mv;
	}
	
	
}
