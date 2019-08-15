package com.wipro.rtvs;

public class LastBuild {
 
private int buildNo;
 private String buildDuration;
 private String status;
 public LastBuild() {
	
	}
 public LastBuild(int buildNo, String buildDuration, String status) {
		super();
		this.buildNo = buildNo;
		this.buildDuration = buildDuration;
		this.status = status;
	}
public int getBuildNo() {
	return buildNo;
}
public void setBuildNo(int buildNo) {
	this.buildNo = buildNo;
}
public String getBuildDuration() {
	return buildDuration;
}
public void setBuildDuration(String buildDuration) {
	this.buildDuration = buildDuration;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
