/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:designPattern
 * Module Name:TODO:Module
 */

/**
 * what:    (这里用一句话描述这个类的作用). <br/>
 * when:    (这里描述这个类的适用时机 – 可选).<br/>
 * how:     (这里描述这个类的使用方法 – 可选).<br/>
 * warning: (这里描述这个类的注意事项 – 可选).<br/>
 *
 * @author 郭飞 created on 2017/12/14
 */
public class Saler2 extends  PriceHandler {

    @Override
    public void discount(Double price) {
        if(1000<=price&&price<2000){
           System.out.println("金额大于1000小于2000,中级人员处理");
        }else{
            System.out.print("金额大于3000则不处理");
        }
    }
}
