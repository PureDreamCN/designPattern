/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:pattern
 * Module Name:TODO:Module
 */

/**
 * what:    目标对象实现类  将有关状态存入到观察者对象中
 *
 * @author 郭飞 created on 2017/12/7
 */
public class ObjectSubject extends  Subject{

    private String subjectStatus;

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
        this.notifyObserver();
    }
}
