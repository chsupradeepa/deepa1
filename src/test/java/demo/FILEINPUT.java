package demo;

import java.io.FileInputStream;

public class FILEINPUT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			FileInputStream fis=new FileInputStream("C:\Users\supra\OneDrive\Desktop\java\html\css");
			properties p=new properties();
			p.load(fis);
			String deepa=p.getproperty("username");
		//	System.out.println(deepa):
			}
			}
	}

}
