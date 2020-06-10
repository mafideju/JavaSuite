package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefixes;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String courseCode, ConstraintValidatorContext ConstraintValidatorContext) {
		
		boolean result = false;
		if (courseCode != null) {
            for (String tempPrefix : coursePrefixes) {
                result = courseCode.startsWith(tempPrefix);			
                if (result) {
                    break;
                }
            }
		} else {
			result = true;
		}

		return result;
	}
	
}
