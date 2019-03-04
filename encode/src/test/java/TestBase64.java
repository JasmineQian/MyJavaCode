import org.testng.annotations.Test;

public class TestBase64 {

    @Test(description = "测试Base64位的加密和解密")
    public void testBase64(){
        String encode = base64Util.encode("12345");
        System.out.println(encode);
        String decode = base64Util.decode("MTIzNDU=");
        System.out.println(decode);
}
}
