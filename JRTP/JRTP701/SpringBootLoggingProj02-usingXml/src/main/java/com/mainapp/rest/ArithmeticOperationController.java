package com.mainapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ArithmeticOperationController {
	
	@GetMapping("/div")
	public String div() {
		log.debug("At begining of div() method");
		try {
			log.debug("performing Arithmetic operation");
			float result=100/0;
			log.debug("Arithmetic Operation Completed Successfully");
			return "return is :: "+result;
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Problem Arithmetic Operation: "+e.getMessage());
			return "problem: "+e.getMessage();
		}
	}
}
