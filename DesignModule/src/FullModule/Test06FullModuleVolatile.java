package FullModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test06FullModuleVolatile {

    private Test06FullModuleVolatile() throws FileNotFoundException {
        this.ConfigRead();//ConfigRead();
    }

    private static volatile Test06FullModuleVolatile sc=null;



    public static Test06FullModuleVolatile newInstance() throws FileNotFoundException {
        if(sc==null){
            //同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
            synchronized (Test06FullModuleVolatile.class) {
                //未初始化，则初始instance变量
                if (sc == null) {
                     sc= new Test06FullModuleVolatile();
                }

    }
}
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
