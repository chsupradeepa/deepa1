package demo;

import java.io.FileInputStream;
import java.util.Properties;

public class cfgcbn {
	FileInputStream fis=new FileInputStream("");
	Properties p=new Properties();
	p.load(fis);
	String asd=p.getProperty("UN");
	System.out.print(asd);
}

}


}
