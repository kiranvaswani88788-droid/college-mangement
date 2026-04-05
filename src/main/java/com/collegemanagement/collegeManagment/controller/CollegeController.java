package com.collegemanagement.collegeManagment.controller;

import com.collegemanagement.collegeManagment.Service.ICollege;
import com.collegemanagement.collegeManagment.entities.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    private ICollege serviceCollege;

    @GetMapping
    public List<College> getCollege() {
        return this.serviceCollege.getCollege();
    }

    @GetMapping("/home/{id}")
    public College getid(@PathVariable("id") String CollegeId) {
        return this.serviceCollege.getid(Long.parseLong(CollegeId));
    }

    @PostMapping("/college")
    public College addcollege(@RequestBody College college) {
        return this.serviceCollege.addcollege(college);
    }

    @DeleteMapping("/college/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String id) {
        try {
            this.serviceCollege.deleteid(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

 // fsdf
}
