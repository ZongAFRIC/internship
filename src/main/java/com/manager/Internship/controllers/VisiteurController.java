package com.manager.Internship.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manager.Internship.entities.Visiteur;
import com.manager.Internship.repositories.VisiteurRepository;



@Controller
public class VisiteurController {
	
	@Autowired
	VisiteurRepository vRepository;
	
	@GetMapping("/create-visiteur")
	public String createVisiteur(Model m, String adresse, String reference, String lienOffre) {
		Visiteur visiteur=new Visiteur(adresse,reference,lienOffre);
		vRepository.save(visiteur);
		m.addAttribute("Visiteurs",vRepository.findAll());
		return "pageVisiteur/ajoutVisiteur";
	}

}
