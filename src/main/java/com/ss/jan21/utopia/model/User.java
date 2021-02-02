package com.ss.jan21.utopia.model;

public class User {

    int userId;
    int roleId;
    String givenName;
    String familyName;
    String userName;
    String email;
    String password;
    String phone;

    public User(int userId, int roleId, String givenName, String familyName, String userName, String email, String password, String phone) {
        this.userId = userId;
        this.roleId = roleId;
        this.givenName = givenName;
        this.familyName = familyName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
