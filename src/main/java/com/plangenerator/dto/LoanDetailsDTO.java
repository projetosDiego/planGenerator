package com.plangenerator.dto;

import java.util.Date;

public class LoanDetailsDTO {
	
	private Double  loanAmount;
	private Integer nominalRate;
	private Integer duration;
	private Date    startDate;
	
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Integer getNominalRate() {
		return nominalRate;
	}
	public void setNominalRate(Integer nominalRate) {
		this.nominalRate = nominalRate;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
