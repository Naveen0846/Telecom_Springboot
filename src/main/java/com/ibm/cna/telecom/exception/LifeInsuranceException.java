package com.ibm.cna.telecom.exception;

public class LifeInsuranceException extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4492250778695756605L;
	private String errorMessage;

	public LifeInsuranceException(String errorMessage) {
		super(); //calling constructor Parent RunTime
		//this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
