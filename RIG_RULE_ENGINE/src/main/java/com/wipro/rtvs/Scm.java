package com.wipro.rtvs;

import java.util.List;

public class Scm {
 
private List<String> contributorsName; 
 private List<String> contributorsEmail; 
 private String commitDate;
 private int commitCount;
 public Scm() {
	}
 public Scm(List<String> contributorsName, List<String> contributorsEmail, String commitDate, int commitCount) {
		super();
		this.contributorsName = contributorsName;
		this.contributorsEmail = contributorsEmail;
		this.commitDate = commitDate;
		this.commitCount = commitCount;
	}
public List<String> getContributorsName() {
	return contributorsName;
}
public void setContributorsName(List<String> contributorsName) {
	this.contributorsName = contributorsName;
}
public List<String> getContributorsEmail() {
	return contributorsEmail;
}
public void setContributorsEmail(List<String> contributorsEmail) {
	this.contributorsEmail = contributorsEmail;
}
public String getCommitDate() {
	return commitDate;
}
public void setCommitDate(String commitDate) {
	this.commitDate = commitDate;
}
public int getCommitCount() {
	return commitCount;
}
public void setCommitCount(int commitCount) {
	this.commitCount = commitCount;
}
}
