package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.PilotService;

@RequestMapping("/pilots")
@Controller
public class PilotController {
	private final PilotService pilotService;

	@Autowired
	public PilotController(PilotService pilotService) {
		this.pilotService = pilotService;
	}
	@GetMapping("/chad")
	public String err(Model model) {
		System.out.println("FOUND ANOTHER");
		return "/empty";
	}

	@GetMapping
	public String index(Model model) {
		System.out.println("FOUND YA");
		model.addAttribute("pilots", pilotService.findAll());
		return "pilots/pilots";
	}


}
