package com.spring.assignment.controller;

import com.spring.assignment.entity.Course;
import com.spring.assignment.service.CourseService;
import com.spring.assignment.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public List<Course> retrieveData(){
        return courseService.findAllCourse();
    }

    @RequestMapping(value = "/add_course", method = RequestMethod.POST)
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
}
