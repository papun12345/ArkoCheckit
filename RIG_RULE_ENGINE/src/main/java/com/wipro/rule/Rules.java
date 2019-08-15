package com.wipro.rule;

public class Rules {
	
	
	private String name;
	private String metric;
	private float threshold;
	private String mName;
	private String operator;
	private int reward=10;
	
	public Rules() {
		
	}
	public Rules(String name, String metric, float threshold, String mName, String operator,int reward) {
		super();
		this.name = name;
		this.metric = metric;
		this.threshold = threshold;
		this.mName = mName;
		this.operator = operator;
		this.reward = reward;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMetric() {
		return metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}
	public float getThreshold() {
		return threshold;
	}
	public void setThreshold(float threshold) {
		this.threshold = threshold;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public int getReward() {
		return reward;
	}
	public void setReward(int reward) {
		this.reward = reward;
	}
	

}
