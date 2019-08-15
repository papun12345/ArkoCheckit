package com.wipro.rtvs;

import java.util.ArrayList;

public class Ci {
	
	private String planKey;
	private ArrayList<BuildInfo> buildInfo;
	private ArrayList<LastBuild> lastBuild;
	public Ci() {
		
	}
	public Ci(String planKey, ArrayList<BuildInfo> buildInfo, ArrayList<LastBuild> lastBuild) {
		super();
		this.planKey = planKey;
		this.buildInfo = buildInfo;
		this.lastBuild = lastBuild;
	}
	public String getPlanKey() {
		return planKey;
	}
	public void setPlanKey(String planKey) {
		this.planKey = planKey;
	}
	public ArrayList<BuildInfo> getBuildInfo() {
		return buildInfo;
	}
	public void setBuildInfo(ArrayList<BuildInfo> buildInfo) {
		this.buildInfo = buildInfo;
	}
	public ArrayList<LastBuild> getLastBuild() {
		return lastBuild;
	}
	public void setLastBuild(ArrayList<LastBuild> lastBuild) {
		this.lastBuild = lastBuild;
	}

}
