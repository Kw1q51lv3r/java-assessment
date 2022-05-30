package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        //imported last two lines from CompositionClass/CourseServices/CourseService.java lesson example for adding into HashMap, and adapted for the variables required for the project.
        //followed the IntelliJ recommendations for the four variables (created local variables, and then initialised via autocomplete)
        //tested to be working.
        String id = student.getId();
        String name = student.getName();
        String email = student.getEmail();
        Date birthDate = student.getBirthDate();
        Student newStudent = new Student(id, name, email, birthDate);
        students.put(id, newStudent);
    }

    public Student findStudent( String studentId )
    {
        //imported from CompositionClass/CourseServices/CourseService.java lesson example. tested to be working.
        Student searchResult = students.get(studentId);
        if (searchResult != null) {
            return searchResult;
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //imported and adapted from CompositionClass/CourseServices/CourseService.java lesson example. unable to resolve errors.
        //cannot be tested
        if(students.get(studentId)==null){
            System.out.println("Enroll Failed. Student could not be found.");
        }
        else if(Course.get(course)==null){
            System.out.println("Enroll Failed. Course could not be found.");
        }
        else {
            Student student = students.get(studentId);
            Course course = Course.get(course);
            student.enrollToCourse(course);
        }
    }
}
