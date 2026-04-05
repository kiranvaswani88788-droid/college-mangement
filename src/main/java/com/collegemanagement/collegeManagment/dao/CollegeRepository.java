package com.collegemanagement.collegeManagment.dao;

import com.collegemanagement.collegeManagment.entities.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

}
