package com.example.springboot.service;

import com.example.springboot.model.*;
import com.example.springboot.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@Service
public class BatteryManagementService implements BatteryManagementRepository {
	
	@Autowired
	private BatteryManagementJpaRepository bMJpaRepository;
	
	@Override
	public BatteryManagement getBatteryById(String batteryId) {
		Integer Id = Integer.parseInt(batteryId);
		BatteryManagement battery = bMJpaRepository.findById(Id).get();
		return battery;
	}

}
