package org.ncu.spring_annotation_workoutapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("cricketDiet")
	
	private Diet diet;

	@Value("${name}")
	private String name;

	
	@Value("${email}")
	private String email;

	
	@Value("${address}")
	private String address;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public void Workout(String name) {
		// TODO Auto-generated method stub
		System.out.println("Practice cricket " + name);

	}

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return diet.getDiet();
	}
}