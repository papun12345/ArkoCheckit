package com.wipro.rtvs;

public class Sonar {

private String projectKey;
 private String ncloc;
 private String complexity;
 private String coverage;
 private String violations;
 private String blockerViolations;
 private String criticalViolations;
 private String qualityStatus;
 public Sonar() 
 {
	
}
 public Sonar(String projectKey, String ncloc, String complexity, String coverage, String violations,
			String blockerViolations, String criticalViolations, String qualityStatus) {
		super();
		this.projectKey = projectKey;
		this.ncloc = ncloc;
		this.complexity = complexity;
		this.coverage = coverage;
		this.violations = violations;
		this.blockerViolations = blockerViolations;
		this.criticalViolations = criticalViolations;
		this.qualityStatus = qualityStatus;
	}
public String getProjectKey() {
	return projectKey;
}
public void setProjectKey(String projectKey) {
	this.projectKey = projectKey;
}
public String getNcloc() {
	return ncloc;
}
public void setNcloc(String ncloc) {
	this.ncloc = ncloc;
}
public String getComplexity() {
	return complexity;
}
public void setComplexity(String complexity) {
	this.complexity = complexity;
}
public String getCoverage() {
	return coverage;
}
public void setCoverage(String coverage) {
	this.coverage = coverage;
}
public String getViolations() {
	return violations;
}
public void setViolations(String violations) {
	this.violations = violations;
}
public String getBlockerViolations() {
	return blockerViolations;
}
public void setBlockerViolations(String blockerViolations) {
	this.blockerViolations = blockerViolations;
}
public String getCriticalViolations() {
	return criticalViolations;
}
public void setCriticalViolations(String criticalViolations) {
	this.criticalViolations = criticalViolations;
}
public String getQualityStatus() {
	return qualityStatus;
}
public void setQualityStatus(String qualityStatus) {
	this.qualityStatus = qualityStatus;
}
}
