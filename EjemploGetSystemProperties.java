import java.util.Properties;

public class EjemploGetSystemProperties {
    public static void main(String[] args) {

        String fileSeparator = System.getProperty("file.separator");
        System.out.println("fileSeparator: " + fileSeparator);

        String classPath = System.getProperty("java.class.path");
        String javaHome = System.getProperty("java.home");
        String javaVendor = System.getProperty("java.vendor");
        String javaVersion = System.getProperty("java.version");
        String osArch = System.getProperty("os.arch");
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String userDir = System.getProperty("user.dir");

        System.out.println("classPath: " + classPath);
        System.out.println("javaHome: " + javaHome);
        System.out.println("javaVendor: " + javaVendor);
        System.out.println("javaVersion: " + javaVersion);
        System.out.println("osArch: " + osArch);
        System.out.println("osName: " + osName);
        System.out.println("osVersion: " + osVersion);
        System.out.println("userName: " + userName);
        System.out.println("userHome: " + userHome);
        System.out.println("userDir: " + userDir);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
