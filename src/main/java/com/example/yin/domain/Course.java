package com.example.yin.domain;

import java.util.Date;

public class Course {

    Integer id;

    String name;

    String type;

    String term;

    String code;

    String number;

    Double credits;

    Double score;

    Float gpa;

    String dayOfWeek;

    Integer timeBegin;

    Integer timeLong;

    Boolean checked;

    String teacher;

    String classroom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(Integer timeBegin) {
        this.timeBegin = timeBegin;
    }

    public Integer getTimeLong() {
        return timeLong;
    }

    public void setTimeLong(Integer timeLong) {
        this.timeLong = timeLong;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", term='" + term + '\'' +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", credits=" + credits +
                ", score=" + score +
                ", gpa=" + gpa +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", timeBegin=" + timeBegin +
                ", timeLong=" + timeLong +
                ", checked=" + checked +
                ", teacher='" + teacher + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
