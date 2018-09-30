package com.manager.Internship.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manager.Internship.entities.Offre;
import com.manager.Internship.entities.User;
import com.manager.Internship.entities.Visiteur;
import com.manager.Internship.repositories.OffreRepository;
import com.manager.Internship.repositories.UserRepository;
import com.manager.Internship.repositories.VisiteurRepository;

@Controller
public class OffreController {
	
	@Autowired
	OffreRepository oRepository;
	@Autowired
	UserRepository uRepository;
	@Autowired
	VisiteurRepository vRepository;
	
	@GetMapping("/traitement-offre")
	public String listeOffres(Model m) {
		m.addAttribute("Offres", oRepository.findAll());
		m.addAttribute("Offres", oRepository.findAll());
		m.addAttribute("Visiteurs", vRepository.findAll());
		return "/pageOffre/create";
	}
	
	
	@GetMapping("/listerOffre")
	public String listesOffres(Model m) {
		m.addAttribute("Offres", oRepository.findAll());
		m.addAttribute("Visiteurs", vRepository.findAll());
		return "pageOffre/aficheOffre";
	}
	
	@GetMapping("/create-offre")
	public String createOffre(Model m, String debut, Long duree, String lieu, String service, String categorie, Long uses, Long visit) throws ParseException {
    
	User user = uRepository.getOne(uses);
	Visiteur visiteur=vRepository.getOne(visit);
	Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(debut);
	Offre offre=new Offre(date1 , duree ,lieu ,service , categorie, user, visiteur);
	oRepository.save(offre);
	//m.addAttribute("Offres", oRepository.findAll());

	return "/pageOffre/create";
	}
	
	@GetMapping("/recherche-offre")
	public String rechercheOffre(@Param("email") String email) {
		
		return null;
		
	}
}
