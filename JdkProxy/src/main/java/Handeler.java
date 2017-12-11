import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理  事务处理器
 */
public class Handeler  implements InvocationHandler {
    private Object target;
    public Handeler(Object target){
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前");
        method.invoke(target);
        System.out.println("方法执行后");
        return null;
    }
}
