import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestConfigRead {

    public static void main(String args[]) throws IOException {
         String browserName;
         String serverURL;

        Properties p = new Properties();
        // 加载配置文件
        InputStream ips = new FileInputStream(".\\TestConfig\\ServerConfig.properties");
        p.load(ips);

        browserName = p.getProperty("value1");
        serverURL = p.getProperty("value2");

        System.out.println(browserName);
        System.out.println(serverURL);
        ips.close();

    }

}
