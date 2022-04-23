package com.fish.springbootlearn.Controller;

import com.fish.springbootlearn.Service.StudentService;
import com.fish.springbootlearn.User.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生Controller
 */
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    public String student(@RequestParam Integer num){
        Student student = studentService.findStudent(num);
        return student.toString();
    }
}
