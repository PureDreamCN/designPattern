/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // 1 创建目标对象
        WeatherSubject weatherSubject = new WeatherSubject();
        //2 创建观察者
        UserObserver userObserver = new UserObserver();
        userObserver.setUserName("用户1");
        userObserver.setActivity("今天出去看电影");

        UserObserver userObserver2 = new UserObserver();
        userObserver2.setUserName("用户2");
        userObserver2.setActivity("今天购物");
        //3 注册观察者
        weatherSubject.add(userObserver);
        weatherSubject.add(userObserver2);
        //4 发布天气预报
        weatherSubject.setSubjectStatus("天气很好");


    }
}
