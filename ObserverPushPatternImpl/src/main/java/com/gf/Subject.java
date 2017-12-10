package com.gf; /**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:pattern
 * Module Name:TODO:Module
 */

import java.util.ArrayList;
import java.util.List;

/**
 * what:    目标对象 提供注册和删除观察者的接口
 * @author 郭飞 created on 2017/12/7
 */
public class Subject {

     private List<Observer> observers = new ArrayList<Observer>();

     public void add(Observer observer){
         observers.add(observer);
     }

     public void  delete(Observer observer){
         observers.remove(observer);
     }

     public void notifyObserver(String content){
          for(Observer observer:observers){
              observer.update(content);
          }
     }



}
