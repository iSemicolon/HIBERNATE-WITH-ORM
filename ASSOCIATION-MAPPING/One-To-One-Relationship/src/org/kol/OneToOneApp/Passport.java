package org.kol.OneToOneApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passport_Details")
public class Passport {
	
	@Id
	@GeneratedValue
	private int passportId;
	private String passportName;
	private String passportNumber;
	
	public int getPassportId() {
		return passportId;
	}
	
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	
	
	public String getPassportName() {
		return passportName;
	}
	
	public void setPassportName(String passportName) {
		this.passportName = passportName;
	}
	
	
	public String getPassportNumber() {
		return passportNumber;
	}
	
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	

}
