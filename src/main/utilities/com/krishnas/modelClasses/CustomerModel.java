package com.krishnas.modelClasses;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CustomerModel")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "CustomerNumber")
	private int CustomerNumber;
	
	@XmlElement(name = "CustomerName")
	private String CustomerName;
	
	@XmlElement(name = "contactLastname")
	private String contactLastname;
	
	@XmlElement(name = "contactFirstname")
	private String contactFirstname;
	
	@XmlElement(name = "phone")
	private String phone;
	
	@XmlElement(name = "addressLine1")
	private String addressLine1;
	
	@XmlElement(name = "addressLine2")
	private String addressLine2;
	
	@XmlElement(name = "city")
	private String city;
	
	@XmlElement(name = "state")
	private String state;
	
	@XmlElement(name = "postalCode")
	private String postalCode;
	
	@XmlElement(name = "country")
	private String country;
	
	@XmlElement(name = "salesRepEmployeeNumber")
	private String salesRepEmployeeNumber;
	
	@XmlElement(name = "creditLimit")
	private String creditLimit;

	public int getCustomerNumber() {
		return CustomerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getContactLastname() {
		return contactLastname;
	}

	public void setContactLastname(String contactLastname) {
		this.contactLastname = contactLastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}

	public void setSalesRepEmployeeNumber(String salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getContactFirstname() {
		return contactFirstname;
	}

	public void setContactFirstname(String contactFirstname) {
		this.contactFirstname = contactFirstname;
	}

}
