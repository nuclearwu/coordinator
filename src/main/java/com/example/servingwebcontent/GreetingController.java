package com.example.servingwebcontent;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@ResponseStatus(HttpStatus.OK)
	@CrossOrigin
	@GetMapping(value = "/health")
	@ResponseBody
	public Boolean checkHealth() {
		return true;
	}

}
