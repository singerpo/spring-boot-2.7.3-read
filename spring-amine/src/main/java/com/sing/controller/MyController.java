package com.sing.controller;

import com.sing.listener.MyHttpSessionListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author songbo
 * @since 2022-08-23
 */
@Controller
public class MyController {
	@RequestMapping("hello")
	public ModelAndView hello(){
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("msg","hello Spring Boot");
		return modelAndView;
	}

	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		HttpSession session = request.getSession(true);
		return "locale";
	}

	@RequestMapping("online")
	public String online(){
		return "当前在线人数："+ MyHttpSessionListener.online +"人";
	}
}
