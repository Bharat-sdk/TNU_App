package com.makertech.tnustudentapp.data.local;

public class UserData {
    String full_name, _uid, role,user_password,user_email;
    int sem;


    public UserData(String full_name, String _uid, String role, int sem,String user_password, String user_email) {
        this.full_name = full_name;
        this._uid = _uid;
        this.role = role;
        this.sem = sem;
        this.user_password = user_password;
        this.user_email = user_email;

    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String get_uid() {
        return _uid;
    }

    public void set_uid(String _uid) {
        this._uid = _uid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
}
