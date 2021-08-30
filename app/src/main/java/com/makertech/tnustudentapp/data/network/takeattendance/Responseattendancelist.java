package com.makertech.tnustudentapp.data.network.takeattendance;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Responseattendancelist {

	@SerializedName("attendanceList")
	private List<AttendanceListItem> attendanceList;

	public void setAttendanceList(List<AttendanceListItem> attendanceList){
		this.attendanceList = attendanceList;
	}

	public List<AttendanceListItem> getAttendanceList(){
		return attendanceList;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"attendanceList = '" + attendanceList + '\'' + 
			"}";
		}
}