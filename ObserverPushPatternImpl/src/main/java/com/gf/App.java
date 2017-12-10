package com.gf;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // 1 创建目标对象
        com.gf.WeatherSubject weatherSubject = new com.gf.WeatherSubject();
        //2 创建观察者
        com.gf.UserObserver userObserver = new com.gf.UserObserver();
        userObserver.setUserName("用户1");
        userObserver.setActivity("今天出去看电影");

        com.gf.UserObserver userObserver2 = new com.gf.UserObserver();
        userObserver2.setUserName("用户2");
        userObserver2.setActivity("今天购物");
        //3 注册观察者
        weatherSubject.add(userObserver);
        weatherSubject.add(userObserver2);
        //4 发布天气预报
        weatherSubject.setSubjectStatus("天气很好");


    }
}
