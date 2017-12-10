package com.gf; /**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:pattern
 * Module Name:TODO:Module
 */

/**
 * what:    观察者实现类
 *
 * @author 郭飞 created on 2017/12/7
 */
public class UserObserver implements  Observer{

    private String userName;
    private String activity;
    private String weartherStatus;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getWeartherStatus() {
        return weartherStatus;
    }

    public void setWeartherStatus(String weartherStatus) {
        this.weartherStatus = weartherStatus;

    }

     /**
     * 获取目标类状态同步到观察者
     * @param subject
     */
    public void update(String content) {
        weartherStatus = content;
        System.out.print("userName    "+userName+"   weartherStatus   "+weartherStatus+"   activity   "+activity);
    }
}
