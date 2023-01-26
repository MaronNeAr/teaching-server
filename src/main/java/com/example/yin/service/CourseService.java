package com.example.yin.service;

import com.example.yin.domain.Course;

import java.util.List;

public interface CourseService {

    Course getCourseById(Integer id);

    boolean addCourse(Course course);

    boolean updateCourse(Course course);

    boolean deleteCourseById(Integer id);

    boolean selectCourseById(Integer id);

    List<Course> selectAllCourse();

}
