package com.hughes.services;

import java.util.List;
import java.util.Optional;

import com.hughes.model.Citizen;



public interface CitizenService {
	public List<Citizen> findAll();
	public int save(Citizen ctzn);
	public int delete(long id);
	public int updateName(Citizen ctzn, String name);
	public Optional<Citizen> findByAadhar(long num);
}
