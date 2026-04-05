package com.collegemanagement.collegeManagment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

import java.util.List;

@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String collegename;
    private String description;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Student> students;

    public College(Long id, String collegename, String description) {
        this.id = id;
        this.collegename = collegename;
        this.description = description;
    }

    public College(String collegename, String description) {
        this.collegename = collegename;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public College() {
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", collegename='" + collegename + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
