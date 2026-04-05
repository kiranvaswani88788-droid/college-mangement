package com.collegemanagement.collegeManagment.Service;

import com.collegemanagement.collegeManagment.entities.College;
import com.collegemanagement.collegeManagment.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> getStudent(Long collegeId);

    Student getid(long id);

    Student addStudent(Student student, Long collegeId);

    void deleteid(long student);

}
