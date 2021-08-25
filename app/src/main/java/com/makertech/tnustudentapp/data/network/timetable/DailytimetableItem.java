package com.makertech.tnustudentapp.data.network.timetable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DailytimetableItem{

	@SerializedName("subjects")
	private List<SubjectsItem> subjects;

	@SerializedName("day")
	private String day;

	public void setSubjects(List<SubjectsItem> subjects){
		this.subjects = subjects;
	}

	public List<SubjectsItem> getSubjects(){
		return subjects;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	@Override
 	public String toString(){
		return 
			"DailytimetableItem{" + 
			"subjects = '" + subjects + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}