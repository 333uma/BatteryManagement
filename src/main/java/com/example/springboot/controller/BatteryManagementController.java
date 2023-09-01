package com.example.springboot.controller;

import com.example.springboot.model.*;

import com.example.springboot.service.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class BatteryManagementController {
	
	@Autowired
	public BatteryManagementService bMS;
	
	@GetMapping("/batteries/{batteryId}")
	public BatteryManagement getBatteryById(@PathVariable("batteryId") String batteryId ){
		return bMS.getBatteryById(batteryId);
	}
}
