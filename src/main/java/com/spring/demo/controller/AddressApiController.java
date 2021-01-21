package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.AddressDTO;
import com.spring.demo.service.AddressService;

@RestController
@RequestMapping("/api")
public class AddressApiController {
	
	@Autowired
	AddressService addressService;

	@GetMapping("/getAddress")
	public ResponseEntity<AddressDTO> confirmUserAccount(@RequestParam("address") String address) {
		return ResponseEntity.ok().body(addressService.getAddress(address));

	}
}
