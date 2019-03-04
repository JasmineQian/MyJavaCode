import FullModule.Test04FullModule;
import FullModule.Test05FullModuleSynchronized;
import FullModule.Test06FullModuleVolatile;
import Hungry.Test03_HungryModule;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;


public class Test02 {
    @Test
    public void doGet() throws FileNotFoundException {
        //一个客户端访问服务器就会构造new一个Test01()对象
        // 解耦合
        Test01 sc = new Test01();
        Test01 sc2 = new Test01();
        System.out.println("------"+sc.getClass()+"-----");
        System.out.println(sc.getValue1());
        System.out.println(sc.getValue2());
        System.out.println(sc.getClass());
        System.out.println(sc==sc2);

    }


    @Test
    public void Test03_HungryModule() throws FileNotFoundException {
        //静态一实例，私有构造器
        //解耦合Test03_HungryModule.class
        Test03_HungryModule sc1 = Test03_HungryModule.newInstance();
        Test03_HungryModule sc2 = Test03_HungryModule.newInstance();
        System.out.println("------"+sc1.getClass()+"-----");
        System.out.println(sc1.getValue1());
        System.out.println(sc1.getValue2());
        System.out.println(sc2.getValue1());
        System.out.println(sc2.getValue2());
        System.out.println(sc1==sc2);


    }


    @Test
    public void Test04FullModule() throws FileNotFoundException {
        //静态一实例，私有构造器
        //解耦合Test03_HungryModule.class
        Test04FullModule sc1 = Test04FullModule.newInstance();
        Test04FullModule sc2 = Test04FullModule.newInstance();
        System.out.println("------"+sc1.getClass()+"-----");
        System.out.println(sc1.getValue1());
        System.out.println(sc1.getValue2());
        System.out.println(sc2.getValue1());
        System.out.println(sc2.getValue2());
        System.out.println(sc1==sc2);
    }


    @Test
    public void Test05FullModuleSynchronized() throws FileNotFoundException {
        //静态一实例，私有构造器
        //解耦合Test03_HungryModule.class
        Test05FullModuleSynchronized sc1 = Test05FullModuleSynchronized.newInstance();
        Test05FullModuleSynchronized sc2 = Test05FullModuleSynchronized.newInstance();
        System.out.println("------"+sc1.getClass()+"-----");
        System.out.println(sc1.getValue1());
        System.out.println(sc1.getValue2());
        System.out.println(sc2.getValue1());
        System.out.println(sc2.getValue2());
        System.out.println(sc1==sc2);
    }


    @Test
    public void Test06FullModuleVolatile() throws FileNotFoundException {
        //静态一实例，私有构造器
        //解耦合Test03_HungryModule.class
        Test06FullModuleVolatile sc1 = Test06FullModuleVolatile.newInstance();
        Test06FullModuleVolatile sc2 = Test06FullModuleVolatile.newInstance();
        System.out.println("------"+sc1.getClass()+"-----");
        System.out.println(sc1.getValue1());
        System.out.println(sc1.getValue2());
        System.out.println(sc2.getValue1());
        System.out.println(sc2.getValue2());
        System.out.println(sc1==sc2);
    }

}
