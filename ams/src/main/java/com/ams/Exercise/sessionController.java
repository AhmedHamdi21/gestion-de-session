package com.ams.Exercise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class sessionController {
	List<Session> L = new ArrayList<>();
	Session ses1 = new Session("OCA", "description", "images.jpeg");
	Session ses2 = new Session("OCA", "description", "images.jpeg");
	Session ses3 = new Session("OCA", "description", "images.jpeg");
	
	
	
	public sessionController() {
		super();
		L.add(ses1);
		L.add(ses2);
		L.add(ses3);
	}

	@RequestMapping("listsession")
	public String listSession(Model model) {
		model.addAttribute("list", L);
		return "listeSession";

	}

	@RequestMapping("addSession")
	public String addtSession() {
		return "addSession";

	}

	@PostMapping("saveSession")
	public String saveSession(@RequestParam("ses") String ses , @RequestParam("desc") String desc) {
		Session s =new Session(ses, desc, desc);
		L.add(s);
		return "redirect:listsession";
	}

}


