package com.sing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author songbo
 * @since 2022-08-24
 */
@Controller
public class LocaleController {
	@RequestMapping("locale")
	public String locale(Model model) {
		model.addAttribute("userName", "lucy");
		return "locale";
	}
}
