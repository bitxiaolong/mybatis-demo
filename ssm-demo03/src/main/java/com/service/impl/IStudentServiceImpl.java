package com.service.impl;

import com.dao.IStudentDao;
import com.domain.Student;
import com.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStudentServiceImpl implements IStudentService {

@Autowired
private IStudentDao iStudentDao;


    @Override
    public int addStudent(Student student) {
        return iStudentDao.addStudent(student);
    }

    @Override
    public int deleteById(int id) {
        return iStudentDao.deleteById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return iStudentDao.updateStudent(student);
    }

    @Override
    public Student queryById(int id) {
        return iStudentDao.queryById(id);
    }

    @Override
    public List<Student> queryAllStudent() {
        return iStudentDao.queryAllStudent();
    }


}
