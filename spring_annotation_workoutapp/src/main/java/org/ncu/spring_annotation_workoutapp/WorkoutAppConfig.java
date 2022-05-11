package org.ncu.spring_annotation_workoutapp;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.ncu.spring_annotation_workoutapp")
@PropertySource("classpath:field.properties")
public class WorkoutAppConfig {

}
