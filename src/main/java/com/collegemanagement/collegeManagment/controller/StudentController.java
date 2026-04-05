package com.collegemanagement.collegeManagment.controller;

import com.collegemanagement.collegeManagment.Service.ICollege;
import com.collegemanagement.collegeManagment.Service.IStudentService;
import com.collegemanagement.collegeManagment.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/college/{collegeId}")
    public List<Student> getStudent(@PathVariable Long collegeId){
        return this.studentService.getStudent(collegeId);
    }


    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable() String studentId){
        return this.studentService.getid(Long.parseLong(studentId));
    }

    @PostMapping("/{collegeId}")
    public Student addStudent(@RequestBody Student student, @PathVariable Long collegeId){
        return this.studentService.addStudent(student, collegeId);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable() String studentId){
        this.studentService.deleteid(Long.parseLong(studentId));
        return;
    }


}
