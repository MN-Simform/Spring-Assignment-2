package com.spring.assignment.service;

import com.spring.assignment.entity.Course;

import java.util.List;

public interface CourseService{

    public List<Course> findAllCourse();
    public String addCourse(Course course);

}
