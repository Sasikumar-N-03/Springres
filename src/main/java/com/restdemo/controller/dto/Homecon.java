package com.restdemo.controller.dto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecon {
	@PostMapping("/save")
	public String saveUserData(@RequestBody Users users) {
		if (users.getUserName().equals("tony")) {
			return "valid username";
		}
		return "invalid user";
	}
}
