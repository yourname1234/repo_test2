package com.Faris.Domain;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer login_id;
    private String username;
    private String password;

    public Integer getLogin_id() {
        return login_id;
    }

    public void setLogin_id(Integer login_id) {
        this.login_id = login_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "login_id=" + login_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
