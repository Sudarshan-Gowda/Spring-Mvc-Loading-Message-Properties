package com.star.sud.web;

import javax.annotation.Resource;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StarLoginController {

	@Resource(name = "messageSource")
	protected ResourceBundleMessageSource messageSrc;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getLoginPage(Model model) {

		Object[] args = new Object[2];
		args[0] = "Sudarshan";
		args[1] = "Gowda";

		model.addAttribute("propertyData", messageSrc.getMessage("author", args, "No property maches found", null));
		return "login/login-page";
	}

}
