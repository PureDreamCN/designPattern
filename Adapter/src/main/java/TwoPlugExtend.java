/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:designPattern
 * Module Name:TODO:Module
 */

/**
 * what:    使用继承方式的适配器
 *
 * @author 郭飞 created on 2017/12/12
 */
public class TwoPlugExtend extends TwoPlug implements ThreePlug {

    @Override
    public void powerWithThree() {
        System.out.print("使用继承方式适配");
       this.powerWithTwo();
    }
}
