package iopackages;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class IoClass1 {
	
	public static void main(String[] args) throws Exception {
//		Reader();
		
//		Reader1();
		Reader2();

		}
	
	
	
	public static void Reader() throws Exception {
		
		InputStream fileInputStream = new FileInputStream("src/iopackages/file-2.txt");
		Reader inputStreamReader = new InputStreamReader(fileInputStream,Charset.forName("UTF-8"));
		int fileData = inputStreamReader.read();
		System.out.println("\nFile-1 Data...\n");
		while(fileData!=-1) {
			System.out.println("fileData Ascii : " +fileData+", filedata char : "+(char)fileData);
			fileData = inputStreamReader.read();
		
	}
		
	}
	
	   public static void Reader1() throws Exception{
	InputStream fileInputStream = new FileInputStream("src/iopackages/file-2.txt");
	Reader inputStreamReader = new InputStreamReader(fileInputStream,Charset.forName("UTF-16"));
		
		int fileData = inputStreamReader.read();
		System.out.println("\nFile-1 Data...\n");
		while(fileData!=-1) {
			System.out.println("fileData Ascii : " +fileData+", filedata char : "+(char)fileData);
			fileData = inputStreamReader.read();
		}

}
	   
	   
	   public static void Reader2() throws Exception{
			InputStream fileInputStream = new FileInputStream("src/iopackages/file-2.txt");
			  InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,Charset.forName("UTF-16"));
		   BufferedReader reader = new BufferedReader(inputStreamReader);
		 
			int fileData = inputStreamReader.read();
			System.out.println("\nFile-1 Data...\n");
			while(fileData!=-1) {
				System.out.println("fileData Ascii : " +fileData+", filedata char : "+(char)fileData);
				fileData = inputStreamReader.read();
		   
	   }
}
}
