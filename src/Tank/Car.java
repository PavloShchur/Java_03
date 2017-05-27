package Tank;

import java.util.Iterator;
import java.util.Scanner;

import Queue_additional.Person;

public class Car {
	Methods methods = new Methods();

	private int ID;
	private String name;
	private int year;
	private int maxSpeed;
	private String model;

	public Car(int iD, String name, int year, int maxSpeed, String model) {
		super();
		ID = iD;
		this.name = name;
		this.year = year;
		this.maxSpeed = maxSpeed;
		this.model = model;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "ID " + ID + ", " + "name " + name + ", " + "year " + year +", " + "maxSpeed " + maxSpeed + ", "
	+ "model " + model;
	}

	
	

	
}
