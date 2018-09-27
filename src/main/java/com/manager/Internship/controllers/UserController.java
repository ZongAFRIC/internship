package com.manager.Internship.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manager.Internship.entities.User;
import com.manager.Internship.repositories.UserRepository;



@Controller
public class UserController {
	
	@Autowired
	UserRepository uRepository;
	
	@GetMapping("/create-user")
	public String createUser(Model m, String nom, String prenom, String email, String password, String fonction, String photo) {
    User user=new User(nom,prenom,email,password, fonction,photo);
	
	uRepository.save(user);
	m.addAttribute("Utilisateurs", uRepository.findAll());
	return "pageUer/pageUser";
	}
	
	
}
