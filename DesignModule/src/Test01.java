import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test01 {

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

    public Test01() throws FileNotFoundException {
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
