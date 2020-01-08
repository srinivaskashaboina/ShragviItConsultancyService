package com.shragviItConsultancy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shragviItConsultancy.entity.EmployeeEntity;
 
 
@Repository
public interface EmployeeRepository 
        extends JpaRepository<EmployeeEntity, Long> {
 
}

