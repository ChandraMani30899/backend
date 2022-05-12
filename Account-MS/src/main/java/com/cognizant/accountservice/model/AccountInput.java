package com.cognizant.accountservice.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
public class AccountInput {
	
	
	@Getter
	@Setter
	@NotNull(message = "Account number is mandatory")
	private long accountId;
	@Getter
	@Setter
	@NotNull(message = "Amount is mandatory")
	private double amount;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	
}