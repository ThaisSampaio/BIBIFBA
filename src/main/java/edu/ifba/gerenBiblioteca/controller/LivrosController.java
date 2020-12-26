package edu.ifba.gerenBiblioteca.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.ifba.gerenBiblioteca.model.Livros;
import edu.ifba.gerenBiblioteca.service.IPLivrosService;

@Controller
public class LivrosController {
	@Autowired
	private IPLivrosService service;
	
	@GetMapping("/Livros/list")
	public String findAll(Model model)
	{
		model.addAttribute("Livros", service.findAll());
		return "Livros/list";
	}
	
	
	@GetMapping("/Livros/delete/{idLivro}")
	public String delete(@PathVariable(name = "idLivro") Integer idLivro) 
	{
		service.delete(idLivro);
		return "redirect:/Livros/list";
	}
	
	
	@GetMapping("/Livros/details/{idLivro}")
	public String find(@PathVariable Integer idLivro, Model model) 
	{
		model.addAttribute("Livros", service.find(idLivro));
		model.addAttribute("mode", "view"); //  Utlizamos para logica visual
		return "Livros/registration-form";
	}
	
	@GetMapping({"/Livros/save/{idLivro}", "/Livros/save"})
	public String loadRegistrationForm(@PathVariable(required = false)
		Integer idLivro, Model model) 
	{
		Livros l;
		String mode;
		if (idLivro == null) {
			mode = "create";
			l = new Livros();
		} else {
			mode = "update";
			l = service.find(idLivro);
		}
		model.addAttribute("Livros", l);
		model.addAttribute("mode", mode);
		return "Livros/registration-form";
	}
	
	@PostMapping("/Livros/save")
	public String save(@ModelAttribute Livros l) 
	{
		l.setCadastro(new Date());
		service.save(l);
		return "redirect:/Livros/list";
	}
	
	
	
	
	

}
