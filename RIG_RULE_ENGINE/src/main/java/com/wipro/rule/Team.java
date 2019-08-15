package com.wipro.rule;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "team")
public class Team {
	@Id
	public ObjectId _id;
	
	private String name;
	private int teamStrength;
	private String badges[];
	private int points;
	private String avatar;
	private ArrayList<Achievements> achievements;
	
	
	public Team() {
		
	}
	
	public Team(ObjectId _id, String name, int teamStrength, String[] badges, int points, String avatar,
			ArrayList<Achievements> achievements) {
		super();
		this._id = _id;
		this.name = name;
		this.teamStrength = teamStrength;
		this.badges = badges;
		this.points = points;
		this.avatar = avatar;
		this.achievements = achievements;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeamStrength() {
		return teamStrength;
	}

	public void setTeamStrength(int teamStrength) {
		this.teamStrength = teamStrength;
	}

	public String[] getBadges() {
		return badges;
	}

	public void setBadges(String[] badges) {
		this.badges = badges;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public ArrayList<Achievements> getAchievements() {
		return achievements;
	}

	public void setAchievements(Achievements achievement) {
		achievements.add(achievement);
	}
	

}
