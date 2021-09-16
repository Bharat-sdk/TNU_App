package com.makertech.tnustudentapp.data.network.teacheravailiblity;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TeacherAvailiblityList {

	@SerializedName("teacherAvaiibality")
	private List<TeacherAvaiibalityItem> teacherAvaiibality;

	public List<TeacherAvaiibalityItem> getTeacherAvaiibality(){
		return teacherAvaiibality;
	}

}