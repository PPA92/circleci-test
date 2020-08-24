package com.ppa.demo.controller;

public class Car {
	private String name;
	private int model;
	private double cc;
	private String brand;

	public Car() {
	}

	public Car(String name, int model, double cc, String brand) {
		this.name = name;
		this.model = model;
		this.cc = cc;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
