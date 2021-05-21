package FileRandom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.hwpf.usermodel.ParagraphProperties;

public class RandomDataChange {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File file=new File(System.getProperty("user.dir")+"\\config.properties");
FileInputStream fis= new FileInputStream(file);
//abhitak handle kiya h abhi read krna h
Properties prop=new Properties();
prop.load(fis);

   String value=prop.getProperty("testsiteurl");
   System.out.println(value);
   
   String id=prop.getProperty("username");
   System.out.println(id);
   
   String password1=prop.getProperty("password");
   System.out.println(password1);
   
	}

}
