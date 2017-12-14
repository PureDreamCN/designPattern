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
 * @author 郭飞 created on 2017/12/12
 */
public class Test  {

    private Targetable threePlug;
    public Test(Targetable threePlug){
        this.threePlug = threePlug;
    }
    public void charge(){
        threePlug.powerWithThree();
    }
    public static void main(String[] args){


      //使用继承方式
       /* Targetable  threePlug = new TwoPlugExtend();
        Test noteBook = new Test(threePlug);
        noteBook.charge();*/

       //使用组合方式则可以适配到子类
           /*  TwoPlug twoPlug = new TwoPlug();
        ThreePlug threePlug = new TwoPlugAdpter(twoPlug);
        NoteBook noteBook = new NoteBook(threePlug);
        noteBook.charge();*/

        Source testTwo = new Source();
        Targetable threePlug = new TwoPlugAdpter(testTwo);
        Test noteBook = new Test(threePlug);
        noteBook.charge();

      //接口适配器
     /*   Targetable targetable = new TwoPlugInterTest();
        targetable.sayHello();*/

    }
}
