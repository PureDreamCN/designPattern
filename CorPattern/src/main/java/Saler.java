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
public class Saler  extends  PriceHandler {

    @Override
    public void discount(Double price) {
        if(price<1000){
          System.out.println("金额小于1000,普通人员可以处理");
        }else{
            successor.discount(price);
        }
    }
}
