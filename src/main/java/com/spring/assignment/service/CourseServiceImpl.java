package com.spring.assignment.service;

import com.spring.assignment.entity.Course;
import com.spring.assignment.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> findAllCourse(){
        return courseRepository.findAll();
    }

    @Override
    public String addCourse(Course course){
        if (course.getId() != 0 && course.getName() != null && course.getPrice() != 0) {
            courseRepository.save(course);
            return "Data Added Successfully";
        } else {
            return "Something Went Wrong";
        }
    }
}
