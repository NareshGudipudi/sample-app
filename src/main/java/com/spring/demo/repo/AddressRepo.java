package com.spring.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.AddressDTO;
@Repository
public interface AddressRepo extends JpaRepository<AddressDTO, String> {

	AddressDTO findByFullAddress(String fullAddress);


}
