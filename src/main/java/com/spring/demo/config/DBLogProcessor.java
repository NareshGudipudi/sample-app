package com.spring.demo.config;
 
import org.springframework.batch.item.ItemProcessor;

import com.spring.demo.model.AddressDTO;

public class DBLogProcessor implements ItemProcessor<AddressDTO, AddressDTO>
{
    public AddressDTO process(AddressDTO address) throws Exception
    {
       System.out.println("Inserting Address : " + address);
        return address;
    }
}