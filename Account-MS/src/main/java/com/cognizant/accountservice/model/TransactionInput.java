package com.cognizant.accountservice.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionInput {
	
	private AccountInput sourceAccount;
	private AccountInput targetAccount;
	@Positive(message = "Transfer amount must be positive")
	@Min(value = 1, message = "Amount must be larger than 1")
	private double amount;
	private String reference;
	public AccountInput getSourceAccount() {
		return sourceAccount;
	}
	public void setSourceAccount(AccountInput sourceAccount) {
		this.sourceAccount = sourceAccount;
	}
	public AccountInput getTargetAccount() {
		return targetAccount;
	}
	public void setTargetAccount(AccountInput targetAccount) {
		this.targetAccount = targetAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	

}