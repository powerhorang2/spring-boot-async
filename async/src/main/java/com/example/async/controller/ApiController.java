package com.example.async.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.async.service.AsyncService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class ApiController {

	private final AsyncService asyncService;
	
	public ApiController(AsyncService asyncService) {
		this.asyncService = asyncService;
	}
	
	@GetMapping("/hello")
	public String hello() {
		asyncService.hello();
		log.info("method end");
		return "hello";
	}
}
