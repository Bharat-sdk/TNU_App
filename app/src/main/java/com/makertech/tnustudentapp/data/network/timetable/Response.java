package com.makertech.tnustudentapp.data.network.timetable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response{

	@SerializedName("dailytimetable")
	private List<DailytimetableItem> dailytimetable;

	public void setDailytimetable(List<DailytimetableItem> dailytimetable){
		this.dailytimetable = dailytimetable;
	}

	public List<DailytimetableItem> getDailytimetable(){
		return dailytimetable;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"dailytimetable = '" + dailytimetable + '\'' + 
			"}";
		}
}