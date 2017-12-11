public class Test {
    public static void main(String[] args){
        CglibProxy cglibProxy =  new CglibProxy();
         Car car = (Car) cglibProxy.getProxy(Car.class);
         car.move();
    }
}
