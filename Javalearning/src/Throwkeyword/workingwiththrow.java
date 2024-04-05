package Throwkeyword;

import java.io.FileOutputStream;

public class workingwiththrow {
	static File file;
	public static void createnewfile() throws IOException{
		file= new File("Sample.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file is created");
		}else {
			System.out.println("file is existed");
		}
	}
	public static void writeInTheFile() throws IOException{
		FileOutputStream fos=new FileOutputStream(file);
		String s1="learning java" \n";"
				fos.write(s1.getBytes());
		String s2="learning java" \n";"
				fos.write(s2.getBytes());
	}
	
		
		
	}

}
