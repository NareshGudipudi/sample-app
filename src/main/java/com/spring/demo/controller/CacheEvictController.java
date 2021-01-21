package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.service.AddressServiceImpl;

@RestController
@RequestMapping("/api")
public class CacheEvictController {
	
	@Autowired
	AddressServiceImpl addressServiceImpl;
	
	@RequestMapping("/evict-cache")
	public ResponseEntity<String> evictLowesDemoCache() {
		
		addressServiceImpl.clearCache();
		return new ResponseEntity<>("Cache is Evicted through Rest API", HttpStatus.OK);
	}
}
