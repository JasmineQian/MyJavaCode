package FullModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test04FullModule {
    //饱汉式单例模式
    //现用现new
    //线程同步会有问题，用时间换空间
    private Test04FullModule() throws FileNotFoundException {
        this.ConfigRead();//ConfigRead();
    }

    private static Test04FullModule sc=null;

    public static Test04FullModule newInstance() throws FileNotFoundException {
        if(sc==null){
            sc =new Test04FullModule(); }
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

