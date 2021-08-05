package org.sangeeta.belong.telephone.bean;

import java.util.List;

public class Customer {

	private String custId;
	private List<String> teleNumbers;
	
	public Customer(String custId, List<String> teleNumbers) {		
		this.custId = custId;
		this.teleNumbers = teleNumbers;
	}
	
	public Customer(String custId, String teleNumber) {		
		this.custId = custId;
		this.teleNumbers.add(teleNumber);
	}	
	
	public String getCustId() {
		return custId;
	}
	
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public List<String> getTeleNumbers() {
		return teleNumbers;
	}
	public void setTeleNumbers(List<String> teleNumbers) {
		this.teleNumbers = teleNumbers;
	}
}
