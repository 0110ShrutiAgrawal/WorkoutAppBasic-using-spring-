package org.ncu.spring_annotation_workoutapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private Diet diet;
	@Autowired
	@Qualifier("tennisDiet")
	public void doWorkoutStuff(Diet diet)
	{
		this.diet = diet;
	}
	
	@Override
	public void Workout(String name) {
		// TODO Auto-generated method stub
		System.out.println("Practice tennis" + name);

	}
	
	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return diet.getDiet();
	}
}