package com.wipro.rtvs;

import java.util.List;

public class Alm 
{
	
	private List<String> wipData;
	private String projectKey;
	private String sprintName;
	private String daysLeft;
	private String todo;
	private String wip;
	private String done;
	private String total;
	private boolean active;
	public Alm() {
		
	}
	public Alm(List<String> wipData, String projectKey, String sprintName, String daysLeft, String todo, String wip,
			String done, String total, boolean active) {
		super();
		this.wipData = wipData;
		this.projectKey = projectKey;
		this.sprintName = sprintName;
		this.daysLeft = daysLeft;
		this.todo = todo;
		this.wip = wip;
		this.done = done;
		this.total = total;
		this.active = active;
	}
	public List<String> getWipData() {
		return wipData;
	}
	public void setWipData(List<String> wipData) {
		this.wipData = wipData;
	}
	public String getProjectKey() {
		return projectKey;
	}
	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}
	public String getSprintName() {
		return sprintName;
	}
	public void setSprintName(String sprintName) {
		this.sprintName = sprintName;
	}
	public String getDaysLeft() {
		return daysLeft;
	}
	public void setDaysLeft(String daysLeft) {
		this.daysLeft = daysLeft;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getWip() {
		return wip;
	}
	public void setWip(String wip) {
		this.wip = wip;
	}
	public String getDone() {
		return done;
	}
	public void setDone(String done) {
		this.done = done;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	

}
