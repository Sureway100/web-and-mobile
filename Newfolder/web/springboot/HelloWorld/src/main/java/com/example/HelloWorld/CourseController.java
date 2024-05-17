package com.example.HelloWorld;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn Aws", "in28Minutes"),
				new Course(2, "Learn DevOps", "in28Minutes"), 
				new Course(3, "Learn Azure", "in28Minutes"),
				new Course(4, "Learn xxxxx", "in28Minutes"),
				new Course(5, "Learn GCP", "in28Minutes")
				);
	}
	
	

}
