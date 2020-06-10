package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processShoutForm")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		String result = "Seja Bem Vindo, " + name + "!!! Prazer ter você aqui!";
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processVersionThree")
	public String processVersionThree(@RequestParam("studentName") String name, Model model) {
		String result = "Rolou de novo , " + name + "!!! Tá pegando forma!!";
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}

