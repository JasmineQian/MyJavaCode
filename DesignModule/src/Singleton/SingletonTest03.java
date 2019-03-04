package Singleton;

public class SingletonTest03 {

    // 定义私有构造方法（防止通过 new SingletonTest()去实例化）
    private SingletonTest03() {
    }

    // 定义一个SingletonTest类型的变量（不初始化，注意这里没有使用final关键字）
    private static SingletonTest03 instance;

    // 定义一个静态的方法（调用时再初始化SingletonTest，使用synchronized 避免多线程访问时，可能造成重的复初始化问题）
    public static synchronized  SingletonTest03 getInstance() {
        if (instance == null)
            instance = new SingletonTest03();
        return instance;
    }
}
