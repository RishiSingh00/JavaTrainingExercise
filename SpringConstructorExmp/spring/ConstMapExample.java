package com.edu.spring;

import java.util.Map;

public class ConstMapExample {
	private String className;
	private Map<Integer,String> rollNo;
	
	public ConstMapExample() {
		super();
	}
	
	public ConstMapExample(String cName,Map sMap) {
		className = cName;
		rollNo = sMap;
	}
	
	public void display() {
		System.out.println("Class of "+className+":");
		System.out.println(rollNo);
	}

	

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Map<Integer, String> getRollNo() {
		return rollNo;
	}

	public void setRollNo(Map<Integer, String> rollNo) {
		this.rollNo = rollNo;
	}
}
