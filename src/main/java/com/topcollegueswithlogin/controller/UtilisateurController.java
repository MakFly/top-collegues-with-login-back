package com.topcollegueswithlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topcollegueswithlogin.entite.Utilisateur;
import com.topcollegueswithlogin.repository.UtilisateurRepository;


@CrossOrigin(origins = "*")
@RestController
//@RequestMapping("/login")
public class UtilisateurController {

	@Autowired private UtilisateurRepository utilRepo;
	

}
