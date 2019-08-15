package com.wipro.rtvs;

public class BuildInfo {
	
	private String buildDate;
	private int successCount;
	private int failureCount;
	private int avgDuration;
	public BuildInfo() {
	}
	public BuildInfo(String buildDate, int successCount, int failureCount, int avgDuration) {
		super();
		this.buildDate = buildDate;
		this.successCount = successCount;
		this.failureCount = failureCount;
		this.avgDuration = avgDuration;
	}
	public String getBuildDate() {
		return buildDate;
	}
	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}
	public int getSuccessCount() {
		return successCount;
	}
	public void setSuccessCount(int successCount) {
		this.successCount = successCount;
	}
	public int getFailureCount() {
		return failureCount;
	}
	public void setFailureCount(int failureCount) {
		this.failureCount = failureCount;
	}
	public int getAvgDuration() {
		return avgDuration;
	}
	public void setAvgDuration(int avgDuration) {
		this.avgDuration = avgDuration;
	}

}
