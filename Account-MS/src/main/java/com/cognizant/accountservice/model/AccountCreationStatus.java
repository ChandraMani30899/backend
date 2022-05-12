package com.cognizant.accountservice.model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class AccountCreationStatus {


	@Id
	@Getter
	@Setter
	private long accountId;
	@Getter
	@Setter
	private String message;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public AccountCreationStatus(long accountId, String message) {
		super();
		this.accountId = accountId;
		this.message = message;
	}


}
