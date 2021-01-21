package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.spring.demo.model.AddressDTO;
import com.spring.demo.repo.AddressRepo;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepo addressRepo;

	@Cacheable(value = "lowesdemocache", key = "#address")
	@Override
	public AddressDTO getAddress(String address) {
		return addressRepo.findByFullAddress(address);
	}

	@CacheEvict(value ="lowesdemocache", allEntries = true)
	public void clearCache() {      
	}
}
