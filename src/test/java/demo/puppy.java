package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class puppy {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\automation\\automation\\src\\test\\resources\\crediantials.properties");
		Properties p=new Properties();
		p.load(fis);
		String asd=p.getProperty("pwd");
		System.out.print(asd);
	}

}
