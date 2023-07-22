package com.shamilymath;

import java.math.BigDecimal;

public class Area {
	private short sqSide;
	private int sqArea;
	private long lgNumber;
	private float length;
	private float width;
	private double radius,base,height;
	private static final String defaultColor = "Black";
	private String color;
	private boolean bl;
	private BigDecimal bd1 = new BigDecimal(343456.457890);
	private BigDecimal bd2 = new BigDecimal(985673.856734);
	
	public Area() {
		this.sqSide = 4;
		this.color = defaultColor;
		this.bl = true;
		this.bd1 = bd1.add(bd2);
			
	
	}
	
	
	public Area(int sqArea,String color) {
		
		this.sqArea = sqArea;
		this.color = color;
			
	}
	
	public Area(float length,float width,String color) {
	
		this.length = length;
		this.width = width;
		this.color = color;
		
		
	}
	public Area(double radius,String color ) {
		
		this.radius = radius;
		this.color = color;
		
		}
	public Area(double base,double height,String color) {
		
		this.base = base;
		this.height = height;
		this.color = color;
		
		}
	public int getAreaOfSquare() {
		
		return sqArea*sqArea;
	}
	
	public float getAreaofRectangle() {
		
		return length*width;
	}
	
	public double getAreaofCircle() {
		
		return radius * radius * Math.PI;
	}
	
	public double getAreaofTraiangle() {
		
		return (base*height)/2;
	}
	
	public String toString() {
		return "Sides = " + sqSide + " Colour: " + color + " Shape: " + bl; 
	}
	
	public void displayBigd() {
		
		System.out.println("Big Decimal: %.4f%n" + bd1);
	}
	public static void main(String[] args) {
		
		Area square = new Area(10,"Blue");
		System.out.println("Area of Square: " + square.getAreaOfSquare());
		System.out.println(square);
		
		Area rec = new Area(13.5f,16.9f,"Red");
		System.out.println("Area of Rectangle: " + rec.getAreaofRectangle());
		System.out.println(rec);
		
		Area circle = new Area(45.2,"Pink");
		System.out.println("Area of Circle: " + circle.getAreaofCircle());
		System.out.println(circle);

		Area triangle = new Area(5.5,7.8,"Yellow");
		System.out.println("Area of Triangle: " + triangle.getAreaofTraiangle() );
		System.out.println(triangle);
		
		Area obj = new Area();
		obj.displayBigd();
		System.out.println(obj);
		
		
	}

}
