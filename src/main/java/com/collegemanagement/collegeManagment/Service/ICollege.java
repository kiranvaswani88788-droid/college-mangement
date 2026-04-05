package com.collegemanagement.collegeManagment.Service;

import com.collegemanagement.collegeManagment.entities.College;

import java.util.List;


public interface ICollege {

    List<College> getCollege();

    College getid(long id);

    College addcollege(College college);

    void deleteid(long Collegeid);

}
