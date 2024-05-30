package utilities;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    //Herseyden once calismasi icin static block icerisinde, olusturmus oldugum properties dosyasini tanimlar
    //ve atamasini yapariz. FileInputStream ile dosya yolunu akisa aliriz.

    static {
        String path = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();//objeyi olusturduk atamasini gerceklestirdik!
            properties.load(fileInputStream);//fis'in okudugu bilgileri properties'e yukler
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        return value;
    }


}