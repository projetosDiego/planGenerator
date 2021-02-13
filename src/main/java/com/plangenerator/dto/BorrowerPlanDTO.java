package com.plangenerator.dto;

import java.util.Date;

public class BorrowerPlanDTO {
	
	private Double borrowerPaymentAmount;
	private Date   date;
	private Double initialOutstandingPrincipal;
	private Double interest;
	private Double principal;
	private Double remainingOutstandingPrincipal;
	
	public Double getBorrowerPaymentAmount() {
		return borrowerPaymentAmount;
	}
	public void setBorrowerPaymentAmount(Double borrowerPaymentAmount) {
		this.borrowerPaymentAmount = borrowerPaymentAmount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getInitialOutstandingPrincipal() {
		return initialOutstandingPrincipal;
	}
	public void setInitialOutstandingPrincipal(Double initialOutstandingPrincipal) {
		this.initialOutstandingPrincipal = initialOutstandingPrincipal;
	}
	public Double getInterest() {
		return interest;
	}
	public void setInterest(Double interest) {
		this.interest = interest;
	}
	public Double getPrincipal() {
		return principal;
	}
	public void setPrincipal(Double principal) {
		this.principal = principal;
	}
	public Double getRemainingOutstandingPrincipal() {
		return remainingOutstandingPrincipal;
	}
	public void setRemainingOutstandingPrincipal(Double remainingOutstandingPrincipal) {
		this.remainingOutstandingPrincipal = remainingOutstandingPrincipal;
	}
}
