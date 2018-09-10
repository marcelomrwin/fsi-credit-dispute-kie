package com.fsi.creditcarddisputecase;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Cardholder implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("State Code")
	private java.lang.String stateCode;
	@org.kie.api.definition.type.Label("Age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label("Status")
	private java.lang.String status;
	@org.kie.api.definition.type.Label("Incident Count")
	private java.lang.Integer incidentCount;

	@org.kie.api.definition.type.Label("Balance Ratio")
	private java.lang.Float balanceRatio;

	@org.kie.api.definition.type.Label("is Minor check")
	private java.lang.String isMinor;

	@org.kie.api.definition.type.Label("Answer")
	private java.lang.String answer;

	@org.kie.api.definition.type.Label(value = "Question Level")
	private java.lang.Integer questionLevel;

	public Cardholder() {
	}

	public java.lang.String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(java.lang.String stateCode) {
		this.stateCode = stateCode;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.Integer getIncidentCount() {
		return this.incidentCount;
	}

	public void setIncidentCount(java.lang.Integer incidentCount) {
		this.incidentCount = incidentCount;
	}

	public java.lang.Float getBalanceRatio() {
		return this.balanceRatio;
	}

	public void setBalanceRatio(java.lang.Float balanceRatio) {
		this.balanceRatio = balanceRatio;
	}

	public java.lang.String getIsMinor() {
		return this.isMinor;
	}

	public void setIsMinor(java.lang.String isMinor) {
		this.isMinor = isMinor;
	}

	public java.lang.String getAnswer() {
		return this.answer;
	}

	public void setAnswer(java.lang.String answer) {
		this.answer = answer;
	}

	public java.lang.Integer getQuestionLevel() {
		return this.questionLevel;
	}

	public void setQuestionLevel(java.lang.Integer questionLevel) {
		this.questionLevel = questionLevel;
	}

	public Cardholder(java.lang.String stateCode, java.lang.Integer age,
			java.lang.String status, java.lang.Integer incidentCount,
			java.lang.Float balanceRatio, java.lang.String isMinor,
			java.lang.String answer, java.lang.Integer questionLevel) {
		this.stateCode = stateCode;
		this.age = age;
		this.status = status;
		this.incidentCount = incidentCount;
		this.balanceRatio = balanceRatio;
		this.isMinor = isMinor;
		this.answer = answer;
		this.questionLevel = questionLevel;
	}

}