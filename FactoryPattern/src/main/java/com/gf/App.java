package com.gf;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args) {

        Factory factory = new Factory();
//        Hair left = factory.getHair("left");
//        left.draw();

      /*   Hair left = factory.getHairByClassName("com.gf.RightHair");
         left.draw();*/
        Hair left = factory.getHairByKey("right");
        left.draw();

    }
}
