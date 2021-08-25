package com.makertech.tnustudentapp.data.network.user;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("user")
	private List<UserItem> user;

	public void setUser(List<UserItem> user){
		this.user = user;
	}

	public List<UserItem> getUser(){
		return user;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"user = '" + user + '\'' + 
			"}";
		}
}