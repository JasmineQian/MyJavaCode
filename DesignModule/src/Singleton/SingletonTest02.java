package Singleton;

public class SingletonTest02 {

    // 定义私有构造方法（防止通过 new Singleton.SingletonTest01()去实例化）
    private SingletonTest02() {
    }

    // 定义一个SingletonTest类型的变量（不初始化，注意这里没有使用final关键字）
    private static SingletonTest02 instance;

    // 定义一个静态的方法（调用时再初始化SingletonTest，但是多线程访问时，可能造成重复初始化问题）
    public static SingletonTest02 getInstance() {
        if (instance == null)
            instance = new SingletonTest02();
        return instance;
    }
}
