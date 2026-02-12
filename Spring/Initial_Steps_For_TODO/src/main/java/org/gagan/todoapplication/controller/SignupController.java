package org.gagan.todoapplication.controller;

import org.gagan.todoapplication.entity.User;
import org.gagan.todoapplication.service.SignupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;

@Controller
public class SignupController {

	private final SignupService signupService;

	public SignupController(SignupService signupService) {
		this.signupService = signupService;
	}

	@GetMapping("/signup")
	public String signupPage(Model model) {
		model.addAttribute("formValidate", new User());
		return "signup";
	}

	@PostMapping("/saveUserDetails")
	public String saveUserDetails(@Valid @ModelAttribute("formValidate") User user,
								  BindingResult result,
								  Model model) {

		if (result.hasErrors()) {
			return "signup";
		}

		try {
			signupService.signup(user);
		} catch (RuntimeException ex) {
			model.addAttribute("error", ex.getMessage());
			return "signup";
		}

		// After successful signup, redirect directly to login
		return "redirect:/login";
	}
}