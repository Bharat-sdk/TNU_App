package com.makertech.tnustudentapp.data.network.timetable;

import com.google.gson.annotations.SerializedName;

public class SubjectsItem{

	@SerializedName("subjecttitle")
	private String subjecttitle;

	@SerializedName("timing")
	private String timing;

	public void setSubjecttitle(String subjecttitle){
		this.subjecttitle = subjecttitle;
	}

	public String getSubjecttitle(){
		return subjecttitle;
	}

	public void setTiming(String timing){
		this.timing = timing;
	}

	public String getTiming(){
		return timing;
	}

	@Override
 	public String toString(){
		return 
			"SubjectsItem{" + 
			"subjecttitle = '" + subjecttitle + '\'' + 
			",timing = '" + timing + '\'' + 
			"}";
		}
}