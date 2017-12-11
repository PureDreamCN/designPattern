import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 *Jdk 动态代理步骤：
 * 1、首先创建一个handeler处理器（实现InvocationHandler接口）
 * 2、创建被代理对象（Car）以及接口(Moveable)
 * 3、调用Proxy的静态方法，创建一个代理类
 * 4、通过代理类调用方法
 */
public class Test {

    public static void main(String[] args){
        Car car = new Car();
        Class<?> cls = car.getClass();
        InvocationHandler inv = new Handeler(car);
        Moveable moveable =(Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), inv);
        moveable.move();
    }
}
