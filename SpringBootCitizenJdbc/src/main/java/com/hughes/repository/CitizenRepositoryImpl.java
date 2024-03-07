package com.hughes.repository;

import java.util.List;
import java.util.Optional;

import com.hughes.model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CitizenRepositoryImpl implements CitizenRepository{
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Citizen> findAll() {
		return jdbctemplate.query("select * from Citizen", (rs,rowNum)->
			new Citizen(rs.getLong("aadharNo"),rs.getString("name"),rs.getLong("mobileno"),rs.getString("address"),rs.getInt("income"))
		);
	}
	public int save(Citizen ctzn) {		
		return jdbctemplate.update("insert into Citizen values(?,?,?,?,?)",ctzn.getAadharNo(),ctzn.getName(),ctzn.getMobileno(),ctzn.getAddress(),ctzn.getIncome());
	}
	
	public int delete(long num) {
		
		return jdbctemplate.update("delete from Citizen where aadharno = ?",num);
	}
	
	public int updateName(Citizen ctzn, String name) {
		return jdbctemplate.update("update Citizen set name = ? where aadharno=?",name,ctzn.getAadharNo());
	}
	
	public Optional<Citizen> findByAadhar(long i) {
		return jdbctemplate.queryForObject("select * from Citizen where studentId=?",new Object[] {i},(rs,rowNum)->
		Optional.of(new Citizen(rs.getLong("aadharno"),rs.getString("name"),rs.getLong("mobile"),rs.getString("address"),rs.getInt("income")))
			);
	}
}
