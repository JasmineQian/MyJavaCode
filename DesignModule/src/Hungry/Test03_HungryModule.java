package Hungry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test03_HungryModule {
    //饿汉式单例模式
    //在内存中先new好单例
    //用空间换时间
    //static的变量什么时候产生并赋值呢？Test03_HungryModule的class Loader的时候  JVM
    private static Test03_HungryModule sc;

    static {
        try {
            sc = new Test03_HungryModule();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

   public static Test03_HungryModule newInstance() {
            return sc;
    }

    private String value1;
    private String value2;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    private Test03_HungryModule() throws FileNotFoundException {
        this.ConfigRead();//ConfigRead();
    }

    private void ConfigRead() throws FileNotFoundException {
        Properties prop = new Properties();
        InputStream ips =new FileInputStream(".\\TestConfig\\ServerConfig.properties");

        try{
            prop.load(ips);
            this.setValue1(prop.getProperty("value1"));
            this.setValue2(prop.getProperty("value2"));
            ips.close();

        }catch(IOException e){
            e.printStackTrace();

        }


    }
}
