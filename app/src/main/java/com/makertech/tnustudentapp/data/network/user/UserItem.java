package com.makertech.tnustudentapp.data.network.user;

import com.google.gson.annotations.SerializedName;

public class UserItem{

	@SerializedName("user_password")
	private String userPassword;

	@SerializedName("user_email")
	private String userEmail;

	@SerializedName("full_name")
	private String fullName;

	@SerializedName("role")
	private String role;

	@SerializedName("sem")
	private String sem;

	@SerializedName("_uid")
	private String uid;

	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}

	public String getUserPassword(){
		return userPassword;
	}

	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}

	public String getUserEmail(){
		return userEmail;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setSem(String sem){
		this.sem = sem;
	}

	public String getSem(){
		return sem;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public String getUid(){
		return uid;
	}

	@Override
 	public String toString(){
		return 
			"UserItem{" + 
			"user_password = '" + userPassword + '\'' + 
			",user_email = '" + userEmail + '\'' + 
			",full_name = '" + fullName + '\'' + 
			",role = '" + role + '\'' + 
			",sem = '" + sem + '\'' + 
			",_uid = '" + uid + '\'' + 
			"}";
		}
}