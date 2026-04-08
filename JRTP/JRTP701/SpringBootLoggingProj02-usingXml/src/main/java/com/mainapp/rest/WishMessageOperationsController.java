package com.mainapp.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishMessageOperationsController {
	
	private Logger logger=LoggerFactory.getLogger(WishMessageOperationsController.class);
	
	@GetMapping("/greet")
	public ResponseEntity<String> showMessaage(){
		logger.info("At the beggining of the showMessaage() method");
		String msg="Good Morning!";
		logger.info("At the end of the showMessage() method");
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
