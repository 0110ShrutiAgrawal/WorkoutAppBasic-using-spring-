package org.ncu.spring_annotation_workoutapp;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
 
@Component
@Scope("prototype")
public class CricketDiet implements Diet {

	public CricketDiet() {
		System.out.println("This will be called when a bean of type Diet gets created!");
	}

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return "Eat high protein";
	}

	// initialization method
	
	@PostConstruct
	public void doInitializationStuff() {
		System.out.println("DIET: Inside the initialization method!!");
	}

	// destruction method
	 @PreDestroy
	public void doDestructionStuff() {
		System.out.println("DIET: Inside the destroy method!!");
	}

}