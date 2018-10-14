package com.aulas.reports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aulas.reports.model.Categoria;
import com.aulas.reports.repository.CategoriaRepository;

@Controller("")
public class HomeController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping("/")
	public String homeContorller(Model model) {		
		List<Categoria> categorias = repository.findAll();		
		model.addAttribute("categorias", categorias);
		return "index"; //"Olá, bem vindo ao home controler ...!";
	}
	
	@GetMapping("/other")
	@ResponseBody
	public String other() {
		return "Olá, bem vindo ao home controler ... OTHER !";
	}
}
