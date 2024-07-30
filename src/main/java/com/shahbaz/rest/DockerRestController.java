package com.shahbaz.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor-api")
public class DockerRestController {
	
	//localhost:8080/actor-api/wish/shahbaz
	
	@GetMapping("/wish/{name}")
	public ResponseEntity<String> showWishMessage(@PathVariable String name){
		return new ResponseEntity<String>("Good morning::"+name,HttpStatus.OK);
	}
}
