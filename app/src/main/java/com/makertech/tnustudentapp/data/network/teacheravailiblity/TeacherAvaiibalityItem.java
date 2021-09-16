package com.makertech.tnustudentapp.data.network.teacheravailiblity;

import com.google.gson.annotations.SerializedName;

public class TeacherAvaiibalityItem{

	@SerializedName("teacherName")
	private String teacherName;

	@SerializedName("availiblity")
	private boolean availiblity;

	public void setTeacherName(String teacherName){
		this.teacherName = teacherName;
	}

	public String getTeacherName(){
		return teacherName;
	}

	public void setAvailiblity(boolean availiblity){
		this.availiblity = availiblity;
	}

	public boolean isAvailiblity(){
		return availiblity;
	}

}