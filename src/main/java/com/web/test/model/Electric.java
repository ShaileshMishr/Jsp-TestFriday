package com.web.test.model;

public class Electric {

	private int meterId;
	private long currentMeterRd;
	private long previousMeterRd;
	private String zone;
	
	public Electric() {
		
	}
	
	

	public Electric(int meterId, long currentMeterRd, long previousMeterRd, String zone) {
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

	public long getCurrentMeterRd() {
		return currentMeterRd;
	}

	public void setCurrentMeterRd(long currentMeterRd) {
		this.currentMeterRd = currentMeterRd;
	}

	public long getPreviousMeterRd() {
		return previousMeterRd;
	}

	public void setPreviousMeterRd(long previousMeterRd) {
		this.previousMeterRd = previousMeterRd;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}


	
	
}
