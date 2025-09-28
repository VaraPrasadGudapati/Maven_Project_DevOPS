package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/msg")
	public String getMsg() {
		return "hello world of DevOPS eng";
	}
}
