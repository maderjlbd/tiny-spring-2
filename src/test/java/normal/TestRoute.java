package normal;

import com.puhui.tinyspring.utils.DomUtilsTest;
import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.util.Properties;

/**
 * Created by puhui on 2016/7/29.
 * 路径测试
 */
public class TestRoute {
    @Test
    public void test() throws Exception{
        Package aPackage = TestRoute.class.getClass().getPackage();
        Package aPackage1 = DomUtilsTest.class.getPackage();
        System.out.println(aPackage1);
        System.out.println(aPackage);
//        InputStream inputStream = TestRoute.class.getClass().getClassLoader().getResourceAsStream("");
        String path1 = TestRoute.class.getClass().getResource("/").getPath();
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        URL location = TestRoute.class.getProtectionDomain().getCodeSource().getLocation();
        File currentDirectory = new File(new File(".").getAbsolutePath());
        System.out.println(currentDirectory.getCanonicalPath());
        System.out.println(currentDirectory.getAbsolutePath());
        System.out.println(location.getFile());
        String property = System.getProperty("user.dir");
        System.out.println(property);
        System.out.println(path);
    }
}
