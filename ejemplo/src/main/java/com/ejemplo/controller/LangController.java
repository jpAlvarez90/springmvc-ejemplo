package com.ejemplo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ejemplo.dao.LangDaoInterface;
import com.ejemplo.entity.Lang;

@Controller
public class LangController {
	
	@Autowired
	private LangDaoInterface langDaoInterface;
	
	@GetMapping("/lang")
	public String lang(Model model) {
		List<Lang> lista = langDaoInterface.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("name", "Juan");
		return "admin/lang";
	}
	
	@PostMapping("/lang/create")
	public String langCreate() {
		return "redirect:/lang";
	}

}
