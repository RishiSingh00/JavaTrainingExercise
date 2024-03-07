package com.hughes.repository;

import java.util.List;
import java.util.Optional;

import com.hughes.model.Citizen;

public interface CitizenRepository {
	public List<Citizen> findAll();

	public int save(Citizen std);
	
	public int delete(long id);

	public int updateName(Citizen ctzn, String name);

	public Optional<Citizen> findByAadhar(long num);
}
