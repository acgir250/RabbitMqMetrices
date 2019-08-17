package com.queue.metrices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MetricesController {

	@RequestMapping("/home")
	public String home() {
		return "welcome";
	}

	@GetMapping("/getloggerdata")
	public ResponseEntity<?> getData() {
		// logic goes here
		return new ResponseEntity("getData", HttpStatus.OK);
	}

}
