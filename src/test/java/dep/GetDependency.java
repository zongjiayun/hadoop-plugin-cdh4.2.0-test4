package dep;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class GetDependency {
	
	
	public static void main(String[] args) throws IOException{
		
		String libPath = "/home/apache/dev/workspaces/kepler3/cdh5/hadoop-plugin-cdh4.2.0-test4/lib";
		
		
		File libFolder = new File(libPath);
		
		ArrayList<String> fileNames = new ArrayList<String>();
		
		
			  String[] subFiles = libFolder.list();
			  
			  
			  FileWriter fw = new FileWriter("hello.txt");
			  
			  
			  for (int i = 0; i < subFiles.length; i++) {  
				  
//				  System.out.println(subFiles[i]);
//				  fileNames.add(subFiles[i]);
				  
				  Dependency dep = new Dependency(i,subFiles[i]); 
				  System.out.println(dep + "\n");
				  
				  fw.write(dep + "\r\n");
			  }   
			  
			  fw.close();
		
	}

}
