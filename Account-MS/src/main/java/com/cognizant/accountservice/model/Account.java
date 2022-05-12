package com.cognizant.accountservice.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "ACCOUNT")
@NoArgsConstructor
@AllArgsConstructor 
public class Account {

	@Id
	@NotNull(message = "Enter Account number")
	@Getter
	@Setter 
	@Column(length=10)
	@SequenceGenerator(name="seq", initialValue = 1000000003)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
	private long accountId;
	
	@NotBlank(message = "Enter customerId")
	@Getter
	@Setter
	private String customerId;

	@NotNull(message = "Enter currentBalance")
	@Getter
	@Setter
	@Min(value=0,message="Please enter valid amount")
	private double currentBalance;

	@Getter
	@Setter
	@NotBlank(message = "Enter accountType")
	private String accountType;

	@Getter
	@Setter
	@NotNull(message = "Enter openingDate")
	private Date openingDate;

	
	@Getter
	@Setter
	@Column(length = 20)
	@NotBlank(message = "Enter ownerName")
	private String ownerName;


	@Getter
	@Setter
	@Transient
	private List<Transaction> transactions;
	
	@Override
	public String toString() {
		return "Account information : [accountId=" + accountId + ", openingDate=" + openingDate + ", currentBalance=" + currentBalance
				+ ", accountType=" + accountType + "]";
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	
	
}