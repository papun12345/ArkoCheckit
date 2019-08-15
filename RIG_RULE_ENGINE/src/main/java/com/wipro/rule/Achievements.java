package com.wipro.rule;

public class Achievements {
	
	
	private String metric;
	private int reward;
	public Achievements() {
		
	}
	public Achievements(String metric, int reward) {
		super();
		this.metric = metric;
		this.reward = reward;
	}
	public String getMetric() {
		return metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}
	public int getReward() {
		return reward;
	}
	public void setReward(int reward) {
		this.reward = reward;
	}
	

}
