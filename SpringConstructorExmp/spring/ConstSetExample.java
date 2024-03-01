package com.edu.spring;
import java.util.Set;

public class ConstSetExample {
	private String setName;
	private Set<String> userSet;
	
	public ConstSetExample() {
		
	}
	
	public ConstSetExample(String name,Set uSet) {
		setName = name;
		userSet = uSet;
	}

    // Getter for setName
    public String getSetName() {
        return setName;
    }

    // Setter for setName
    public void setSetName(String setName) {
        this.setName = setName;
    }

    // Getter and setter for userSet
    public Set<String> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<String> userSet) {
        this.userSet = userSet;
    }
	
	public void display() {
		System.out.println("Set of "+setName+":");
		System.out.println(userSet);
	}
}
