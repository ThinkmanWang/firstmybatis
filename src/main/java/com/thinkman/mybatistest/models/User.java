package com.thinkman.mybatistest.models;

import java.io.Serializable;

/**
 * Created by wangx on 2017-02-27.
 */
public class User {

    private String token;

    private long create_time;

    private long expire_time;

    private String password;

    private String user_name;

    private long id;

    public void setToken(String token){
        this.token = token;
    }
    public String getToken(){
        return this.token;
    }
    public void setCreate_time(long create_time){
        this.create_time = create_time;
    }
    public long getCreate_time(){
        return this.create_time;
    }
    public void setExpire_time(long expire_time){
        this.expire_time = expire_time;
    }
    public long getExpire_time(){
        return this.expire_time;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setUser_name(String user_name){
        this.user_name = user_name;
    }
    public String getUser_name(){
        return this.user_name;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
}
