package com.Number.java;

public class Mobile {
	public int memory;
	public int ram;
	public String brand;
	
	
	public Mobile(int memory, int ram, String brand) {
		// TODO Auto-generated constructor stub
		this.memory = memory;
		this.ram = ram;
		this.brand = brand;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String toString() 
	{
		
		return " : "+this.memory+" :"+this.ram+" :"+this.brand;
	}

}
