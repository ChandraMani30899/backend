package com.cognizant.accountservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthenticationResponse {
	
	@Getter
	@Setter
	private String userid;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private boolean isValid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	
	
	
}