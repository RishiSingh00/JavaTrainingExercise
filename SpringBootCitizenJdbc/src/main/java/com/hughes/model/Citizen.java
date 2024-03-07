package com.hughes.model;

public class Citizen {
	private long aadharNo;
	private String name;
	private long mobileno;
	private String address;
	private int income;
	
	
	public Citizen() {
		super();
	}
	public Citizen(long aadharNo, String name, long mobileno, String address, int income) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.mobileno = mobileno;
		this.address = address;
		this.income = income;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
}
