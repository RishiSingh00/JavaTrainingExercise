package com.hughes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.model.Citizen;
import com.hughes.repository.CitizenRepository;

@Service
public class CitizenServiceImpl implements CitizenService{
	@Autowired
	CitizenRepository Citizenrepo;
	
	
	public List<Citizen> findAll() {
		return Citizenrepo.findAll();
	}
	public int save(Citizen std) {
		return Citizenrepo.save(std);
	}
	public int delete(long id) {
		return Citizenrepo.delete(id);
	}
	public int updateName(Citizen std, String name) {
		return Citizenrepo.updateName(std,name);
	};
	public Optional<Citizen> findByAadhar(long num) {
		return Citizenrepo.findByAadhar(num);
	}
	
}
