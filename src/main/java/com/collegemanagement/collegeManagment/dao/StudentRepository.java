package com.collegemanagement.collegeManagment.dao;

import com.collegemanagement.collegeManagment.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.security.sasl.SaslServer;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,  Long> {

//    @Query("SELECT * FROM student where college_id = 4;")
//    List<Student> getStudentsByCollegeId(Long collegeId);
//
//
//    List<Student> findByStudentName(String name);
//
//    @Query("SELECT * FROM Student where collegeId = 4;")
//    List<Student> getStudentsByCollegeId(Long collegeId);


    @Query("SELECT s FROM Student s WHERE s.college.id = :collegeId")
    List<Student> getStudentsByCollegeId(@Param("collegeId") Long collegeId);
}
