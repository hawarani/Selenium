package package3;
import java.util.*;
public class WorkingWithFileHandling {
	
		public static void main(String[] args) throws IOException   {
		File file=new File("PracticeFileHandling.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file is created");
		}else {
			System.out.println("file already exist");
		}
		//write in the file
		FileOutputStream fos=new FileOutputStream(file);
	      String s1="I Live in London \n";
	      fos.write(s1.getBytes());
	      String s2="I am Learning java \n";
	      fos.write(s2.getBytes());
	      String s3="I am learning File Handling \n";
	      fos.write(s3.getBytes());
	      //to read data from file
	      FileInputStream fis=new FileInputStream(file);
	      int i=fis.read();
	      while(i!=-1) {
	    	  System.out.print((char)i);
	    	  i=fis.read();
	      }
	      
	      
		}
	}





