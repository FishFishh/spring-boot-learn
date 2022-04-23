package com.fish.springbootlearn.Service;

import com.fish.springbootlearn.Mapper.StudentMapper;
import com.fish.springbootlearn.User.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 学生Service
 */
@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    public Student findStudent(Integer id){
        return studentMapper.findById(id);
    }
}
