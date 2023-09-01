package com.example.springboot.repository;

import com.example.springboot.model.*;

import java.util.*;
public interface BatteryManagementRepository {
	public BatteryManagement getBatteryById(String batteryId);
}
