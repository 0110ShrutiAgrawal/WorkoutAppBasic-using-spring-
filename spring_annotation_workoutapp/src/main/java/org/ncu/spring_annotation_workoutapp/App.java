package org.ncu.spring_annotation_workoutapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WorkoutAppConfig.class);
		Coach service = context.getBean("cricketCoach", Coach.class);

		service.Workout("Rachel");
		System.out.println("Get your daily fortune here: " + service.getDiet());

		CricketCoach c = context.getBean("cricketCoach", CricketCoach.class);
//		TennisCoach t = context.getBean("tennisCoach", TennisCoach.class);

		System.out.println("Developer's Email: " + c.getEmail());
		System.out.println("Developer's Name: " + c.getName());
		System.out.println("Developer's Address: " + c.getAddress());
	
		// close the context
		context.close();
	}
}
