package Singleton;

public class SingletonTest01 {

    // 定义一个私有的构造方法
    private SingletonTest01() {
    }

    // 将自身的实例对象设置为一个属性,并加上Static和final修饰符
    private static final SingletonTest01 instance = new SingletonTest01();

    // 静态方法返回该类的实例
    public static SingletonTest01 getInstancei() {
        return instance;
    }

}
