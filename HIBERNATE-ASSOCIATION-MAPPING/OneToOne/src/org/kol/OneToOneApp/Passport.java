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
	private int passId;
	private String PassName;
	private String passportNumber;
	
	public int getPassId() {
		return passId;
	}
	public void setPassId(int passId) {
		this.passId = passId;
	}
	public String getPassName() {
		return PassName;
	}
	public void setPassName(String passName) {
		PassName = passName;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	
	
	

}
