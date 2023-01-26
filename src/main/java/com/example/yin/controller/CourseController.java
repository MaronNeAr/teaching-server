package com.example.yin.controller;

import com.example.yin.common.ErrorMessage;
import com.example.yin.common.SuccessMessage;
import com.example.yin.domain.Course;
import com.example.yin.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/course")
    public Object getAllCourse() {
        return new SuccessMessage<List<Course>>(null, courseService.selectAllCourse()).getMessage();
    }

    @GetMapping("/course/select/{id}")
    public Object selectCourse(@PathVariable("id") Integer id) {
        boolean flag = courseService.selectCourseById(id);
        if (!flag) return new ErrorMessage("选/退课失败,可能原因为:选课与已选课程冲突").getMessage();
        else return new SuccessMessage<Boolean>("选/退课成功", true).getMessage();
    }

    @GetMapping("/course/delete/{id}")
    public Object deleteCourse(@PathVariable("id") Integer id) {
        boolean flag = courseService.deleteCourseById(id);
        if (!flag) return new ErrorMessage("删除课程失败").getMessage();
        else return new SuccessMessage<Boolean>("删除课程成功", true).getMessage();
    }

    @PostMapping("/course/add")
    public Object addCourse(HttpServletRequest req) {
        Course course = new Course();
        course.setName(req.getParameter("name"));
        course.setType(req.getParameter("type"));
        course.setTerm(req.getParameter("term"));
        course.setCode(req.getParameter("code"));
        course.setNumber(req.getParameter("number"));
        course.setTeacher(req.getParameter("teacher"));
        course.setClassroom(req.getParameter("classroom"));
        course.setTimeBegin(Integer.valueOf(req.getParameter("timeBegin")));
        course.setTimeLong(Integer.valueOf(req.getParameter("timeLong")));
        course.setDayOfWeek(req.getParameter("dayOfWeek"));
        course.setCredits(Double.valueOf(req.getParameter("credits")));
        course.setScore(Double.valueOf(req.getParameter("score")));
        course.setChecked(false);
        float gpa;
        if (course.getScore() >= 90) gpa = 4.0F;
        else if (course.getScore() >= 85) gpa = (float) 3.7;
        else if (course.getScore() >= 82) gpa = (float) 3.3;
        else if (course.getScore() >= 78) gpa = 3.0F;
        else if (course.getScore() >= 75) gpa = (float) 2.7;
        else if (course.getScore() >= 72) gpa = (float) 2.3;
        else if (course.getScore() >= 68) gpa = 2.0F;
        else if (course.getScore() >= 65) gpa = (float) 1.7;
        else if (course.getScore() >= 63) gpa = (float) 1.3;
        else if (course.getScore() >= 62) gpa = 1.0F;
        else gpa = 0.0F;
        course.setGpa(gpa);
        return new SuccessMessage<Boolean>("添加成功！",courseService.addCourse(course)).getMessage();
    }
}
