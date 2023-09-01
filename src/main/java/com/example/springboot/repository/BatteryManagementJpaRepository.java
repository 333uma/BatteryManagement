package com.example.springboot.repository;

import com.example.springboot.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatteryManagementJpaRepository extends  JpaRepository<BatteryManagement, Integer>{
	
}
