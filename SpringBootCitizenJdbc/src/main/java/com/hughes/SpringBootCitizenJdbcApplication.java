package com.hughes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hughes.model.Citizen;
import com.hughes.services.CitizenService;

@SpringBootApplication
public class SpringBootCitizenJdbcApplication implements CommandLineRunner {

	@Autowired
	CitizenService citizenService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCitizenJdbcApplication.class, args);
	}
	
	@Override
	public void run(String ...args) {
		for(Citizen c:citizenService.findAll()) {
			System.out.println(c.getAadharNo()+" "+c.getName()+" "+c.getMobileno()+" "+
					c.getAddress()+" "+c.getIncome()
					);
		}
		
		Citizen ctzn =new Citizen();
		ctzn.setAadharNo(123456789014L);
		ctzn.setName("xyz");
		ctzn.setMobileno(1234567890);
		ctzn.setAddress("gwl");
		ctzn.setIncome(25000);
		
		System.out.println(citizenService.save(ctzn)+" created");
		
		System.out.println(citizenService.updateName(ctzn,"suresh")+" updated");
		
		System.out.println(citizenService.delete(ctzn.getAadharNo())+" deleted");
		
		
	}

}
