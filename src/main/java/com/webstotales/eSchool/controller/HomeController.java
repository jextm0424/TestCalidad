package com.webstotales.eSchool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webstotales.eSchool.domain.Usuario;
import com.webstotales.eSchool.service.ManageUsuarioRepository;

@Controller
public class HomeController {
	
	@Autowired
	private ManageUsuarioRepository muserrepo;
	
	@RequestMapping(value = "/")
	public ModelAndView login(){
		ModelAndView result = new ModelAndView("login");
		result.addObject("usuario", new Usuario());
		return result;
	}
	
	
	
}
