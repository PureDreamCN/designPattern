/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:designPattern
 * Module Name:TODO:Module
 */

/**
 * what:    二相转三相适配器 组合方式适配器
 *
 * @author 郭飞 created on 2017/12/12
 */
public class TwoPlugAdpter implements  ThreePlug {

    private  TwoPlug twoPlug;
    public TwoPlugAdpter( TwoPlug twoPlug){
        this.twoPlug = twoPlug;
    }
    @Override
    public void powerWithThree() {
        System.out.println("转换为二相电流");
        twoPlug.powerWithTwo();
    }
}
