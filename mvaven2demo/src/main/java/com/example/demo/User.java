package com.example.demo;

/**
 * @author ningshunbin
 * @date 2023-02-11 - 19:27
 */
public class User {
    private int userId;
    private String userName;

    public User() {

    }

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
