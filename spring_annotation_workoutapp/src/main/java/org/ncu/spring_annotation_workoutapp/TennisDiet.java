package org.ncu.spring_annotation_workoutapp;
import org.springframework.stereotype.Component;
@Component
public class TennisDiet implements Diet {
	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return "Eat carbs";
	}

}
