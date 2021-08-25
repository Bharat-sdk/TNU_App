package com.makertech.tnustudentapp.data.network.takeattendance;

import com.google.gson.annotations.SerializedName;

public class AttendanceListItem{

	@SerializedName("student_name")
	private String studentName;

	@SerializedName("present_absent")
	private boolean presentAbsent;

	public void setStudentName(String studentName){
		this.studentName = studentName;
	}

	public String getStudentName(){
		return studentName;
	}

	public void setPresentAbsent(boolean presentAbsent){
		this.presentAbsent = presentAbsent;
	}

	public boolean isPresentAbsent(){
		return presentAbsent;
	}

	@Override
 	public String toString(){
		return 
			"AttendanceListItem{" + 
			"student_name = '" + studentName + '\'' + 
			",present_absent = '" + presentAbsent + '\'' + 
			"}";
		}
}