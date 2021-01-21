package com.spring.demo.config;
 
import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.demo.model.AddressDTO;
import com.spring.demo.repo.AddressRepo;

public class DBWriter implements ItemWriter<AddressDTO> {

   @Autowired
   AddressRepo repo;

	@Override
	public void write(List<? extends AddressDTO> items) throws Exception {
		repo.saveAll(items);
		
	}
}