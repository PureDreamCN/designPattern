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
public abstract class PriceHandler {

    //后继者
    protected  PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    public PriceHandler getSuccessor() {
        return successor;
    }

    //折扣价格
    public abstract  void discount(Double price);

    public static PriceHandler createPriceHandler(){
        PriceHandler saler = new Saler();
        PriceHandler saler2= new Saler2();
        saler.setSuccessor(saler2);
        return saler;
    }
}
