package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class EtudiantContoller {
	@RequestMapping("list") 
	//@ResponseBody
	public String listEtudiants(Model model  )  
	{
		int total =  15;
		String trainer = "amine";
		model.addAttribute("totalStudent",total );
		model.addAttribute("trainerStudent",trainer);
		return "listEtudiant";
	}
	
	@RequestMapping("add")
	//@ResponseBody
	public String AddEtudiants() 
	{
		
		return "addEtudiant";
	}
	@PostMapping("saveEtudiant")
	//@ResponseBody
	

		public String saveEtudiant(Model model,@RequestParam("nom") String nom) {
		model.addAttribute("saveStudent",nom );
		return "affichage";
	} 



}
