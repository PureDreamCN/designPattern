/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:pattern
 * Module Name:TODO:Module
 */
package com.gf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * what:    工厂类
 *
 * @author 郭飞 created on 2017/12/7
 */
public class Factory {

    /**
     * 普通的创建类的方法
     *
     * @param key
     * @return
     */
    public Hair getHair(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        }
        return null;
    }

    /**
     * 根据类的名称来获取对象  类的反射
     *
     * @param className
     * @return
     */
    public Hair getHairByClassName(String className) {
        try {
            Hair hair = (Hair) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 读取properties文件获取对象
     * @param key
     * @return
     */
    public Hair getHairByKey(String key) {
        Map<String, Object> map = getProperties();
        try {
            Hair hair = (Hair) Class.forName((String) map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 读取属性文件
     * @return
     */

    public Map<String, Object> getProperties() {
        Map<String, Object> map = new HashMap<String, Object>();
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("keyToClassName.properties");
        Properties p = new Properties();
        try {
            p.load(inputStream);
            Enumeration enumeration = p.propertyNames();
            while(enumeration.hasMoreElements()){
                String key = (String) enumeration.nextElement();
                String value = p.getProperty(key);
                map.put(key,value);
            }
        } catch (IOException e1) {
            e1.printStackTrace();

        }

        return map;

    }
}
