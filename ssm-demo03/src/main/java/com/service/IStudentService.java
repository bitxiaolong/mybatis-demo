package com.service;

import com.domain.Student;

import java.util.List;

public interface IStudentService {

    int addStudent(Student student);
    int deleteById(int id);
    int updateStudent(Student student);
    Student queryById(int id);
    List<Student> queryAllStudent();
}
