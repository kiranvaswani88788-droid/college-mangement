package com.collegemanagement.collegeManagment.Service;

import com.collegemanagement.collegeManagment.dao.CollegeRepository;
import com.collegemanagement.collegeManagment.entities.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCollege implements ICollege {

    @Autowired
    CollegeRepository collegeRepository;

    public ServiceCollege() {
    }

    @Override
    public List<College> getCollege() {
        return collegeRepository.findAll();
    }

    @Override
    public College addcollege(College college) {
        return collegeRepository.save(college);
    }

    public College getid(long collegeId) {
        return collegeRepository.findById(collegeId).get();
    }

    @Override
    public void deleteid(long Collegeid) {
        Optional<College> entity = collegeRepository.findById(Collegeid);
        if (entity.isPresent()){
            collegeRepository.delete(entity.get());
        }
    }


    public void findByID(String collegeName) {
    }

}
