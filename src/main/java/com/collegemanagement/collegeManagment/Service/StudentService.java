package com.collegemanagement.collegeManagment.Service;

import com.collegemanagement.collegeManagment.dao.CollegeRepository;
import com.collegemanagement.collegeManagment.dao.StudentRepository;
import com.collegemanagement.collegeManagment.entities.College;
import com.collegemanagement.collegeManagment.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CollegeRepository collegeRepository;

    @Override
    public List<Student> getStudent(Long collegeId) {
        return studentRepository.getStudentsByCollegeId(collegeId);
    }

    @Override
    public Student getid(long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()){
            return optionalStudent.get();
        }
        return null;
    }

    @Override
    public Student addStudent(Student student, Long collegeId) {

        Optional<College> optionalCollege = collegeRepository.findById(collegeId);

        if (optionalCollege.isPresent()){
            student.setCollege(optionalCollege.get());
        } else {
            throw new RuntimeException("Bhai tu jisa college me aya  hai woh toh hai hi nhi");
        }

        return studentRepository.save(student);
    }

    @Override
    public void deleteid(long studentId) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);

        if (optionalStudent.isPresent()){
            studentRepository.delete(optionalStudent.get());
        }
    }
}
