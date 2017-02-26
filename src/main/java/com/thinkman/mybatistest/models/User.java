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

    private String avatar;

    private long leader_uid;

    private String show_name;

    private String title;

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setLeader_uid(long leader_uid) {
        this.leader_uid = leader_uid;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {

        return avatar;
    }

    public long getLeader_uid() {
        return leader_uid;
    }

    public String getShow_name() {
        return show_name;
    }

    public String getTitle() {
        return title;
    }

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
