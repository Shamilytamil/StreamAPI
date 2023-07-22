package com.customerList;


public class Customer {

	private String cusId;
	private String cusName;
	private String cusPh;
	private String cusArea;
	private String cusDis;
	
	Customer(){
	}

	public Customer(String cusId, String cusName, String cusPh, String cusArea, String cusDis) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusPh = cusPh;
		this.cusArea = cusArea;
		this.cusDis = cusDis;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusPh() {
		return cusPh;
	}

	public void setCusPh(String cusPh) {
		this.cusPh = cusPh;
	}

	public String getCusArea() {
		return cusArea;
	}

	public void setCusArea(String cusArea) {
		this.cusArea = cusArea;
	}

	public String getCusDis() {
		return cusDis;
	}

	public void setCusDis(String cusDis) {
		this.cusDis = cusDis;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusPh=" + cusPh + ", cusArea=" + cusArea
				+ ", cusDis=" + cusDis + "]";
	}
	
	
}


