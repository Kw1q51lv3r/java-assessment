package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        //imported last two lines from CompositionClass.CourseServices.CourseService.java example code for adding into HashMap, and adapted for the variables required for the project.
        //followed the IntelliJ recommendations for the four variables (created local variables, and then initialised via autocomplete)
        String id = student.getId();
        String name = student.getName();
        String email = student.getEmail();
        Date birthDate = student.getBirthDate();
        Student newStudent = new Student(id, name, email, birthDate);
        students.put(id, newStudent);
    }

    public Student findStudent( String studentId )
    {
        //TODO
        return null;
    }

    public boolean showSummary()
    {
        //TODO
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
    }
}
