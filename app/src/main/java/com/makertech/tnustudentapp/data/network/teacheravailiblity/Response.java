package com.makertech.tnustudentapp.data.network.teacheravailiblity;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("teacherAvaiibality")
	private List<TeacherAvaiibalityItem> teacherAvaiibality;

	public void setTeacherAvaiibality(List<TeacherAvaiibalityItem> teacherAvaiibality){
		this.teacherAvaiibality = teacherAvaiibality;
	}

	public List<TeacherAvaiibalityItem> getTeacherAvaiibality(){
		return teacherAvaiibality;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"teacherAvaiibality = '" + teacherAvaiibality + '\'' + 
			"}";
		}
}