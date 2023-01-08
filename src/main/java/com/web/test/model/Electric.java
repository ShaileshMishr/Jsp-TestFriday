package com.web.test.model;

public class Electric {

	private int meterId;
	private int currentMeterRd;
	private int previousMeterRd;
	private String zone;
	
	public Electric() {
		
	}
	
	public Electric(int meterId, int currentMeterRd, int previousMeterRd, String zone) {
		super();
		this.meterId = meterId;
		this.currentMeterRd = currentMeterRd;
		this.previousMeterRd = previousMeterRd;
		this.zone = zone;
	}

	public int getMeterId() {
		return meterId;
	}

	public void setMeterId(int meterId) {
		this.meterId = meterId;
	}

	public int getCurrentMeterRd() {
		return currentMeterRd;
	}

	public void setCurrentMeterRd(int currentMeterRd) {
		this.currentMeterRd = currentMeterRd;
	}

	public int getPreviousMeterRd() {
		return previousMeterRd;
	}

	public void setPreviousMeterRd(int previousMeterRd) {
		this.previousMeterRd = previousMeterRd;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}


	
	
}
