/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:pattern
 * Module Name:TODO:Module
 */

/**
 * what:    观察者实现类
 *
 * @author 郭飞 created on 2017/12/7
 */
public class ObjectObserver   implements  Observer{

    private String observerStatus;

    public String getObserverStatus() {
        return observerStatus;
    }

    public void setObserverStatus(String observerStatus) {
        this.observerStatus = observerStatus;
    }

    /**
     * 获取目标类状态同步到观察者
     * @param subject
     */
    public void update(Subject subject) {
        observerStatus = ((ObjectSubject)subject).getSubjectStatus();
    }
}
