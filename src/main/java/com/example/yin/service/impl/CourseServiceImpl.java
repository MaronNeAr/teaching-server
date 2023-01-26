package com.example.yin.service.impl;

import com.example.yin.dao.CourseMapper;
import com.example.yin.domain.Course;
import com.example.yin.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;


    @Override
    public Course getCourseById(Integer id) {
        return courseMapper.getCourseById(id);
    }

    @Override
    public boolean addCourse(Course course) {
        return courseMapper.addCourse(course) > 0;
    }

    @Override
    public boolean updateCourse(Course course) {
        return courseMapper.updateCourse(course) > 0;
    }

    @Override
    public boolean deleteCourseById(Integer id) {
        return courseMapper.deleteCourseById(id) > 0;
    }

    @Override
    public boolean selectCourseById(Integer id) {
        Course course = courseMapper.getCourseById(id);
        Boolean checked = course.getChecked();

        if (checked) return courseMapper.selectCourseById(id, false) > 0;

        List<Course> list = courseMapper.selectAllCourse();
        for (Course item : list) {
            if (item.getChecked() && item.getDayOfWeek().equals(course.getDayOfWeek())
                && Math.abs(item.getTimeBegin() - course.getTimeBegin()) < Math.min(item.getTimeLong(), course.getTimeLong())) {
                    return false;
            }
        }
        return courseMapper.selectCourseById(id, !course.getChecked()) > 0;
    }

    @Override
    public List<Course> selectAllCourse() {
        return courseMapper.selectAllCourse();
    }
}
