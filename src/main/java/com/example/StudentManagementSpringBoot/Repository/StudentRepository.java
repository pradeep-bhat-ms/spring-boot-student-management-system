package com.example.StudentManagementSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementSpringBoot.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
