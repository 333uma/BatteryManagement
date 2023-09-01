package com.example.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "battery")
public class BatteryManagement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "battery_id")
	private String battery_id;
	
	@Column(name = "current")
	private Float current;
	
	@Column(name = "voltage")
	private Float voltage;
	
	@Column(name = "temperature")
	private Float temperature;
	
	public BatteryManagement(int id, String battery_id, Float current, Float voltage, Float temperature) {
		this.id = id;
		this.battery_id = battery_id;
		this.current = current;
		this.voltage = voltage;
		this.temperature = temperature;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBattery_id() {
		return battery_id;
	}

	public void setBattery_id(String battery_id) {
		this.battery_id = battery_id;
	}

	public Float getCurrent() {
		return current;
	}

	public void setCurrent(Float current) {
		this.current = current;
	}

	public Float getVoltage() {
		return voltage;
	}

	public void setVoltage(Float voltage) {
		this.voltage = voltage;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
	
	
}
