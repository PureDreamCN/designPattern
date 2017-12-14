/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:designPattern
 * Module Name:TODO:Module
 */

/**
 * what:    普通会员
 *
 * @author 郭飞 created on 2017/12/14
 */
public class Customer1 implements  Strategy {

    @Override
    public double calculatePrice(Double price) {
        System.out.print("普通会员没有折扣"+price);
        return  price;
    }
}
