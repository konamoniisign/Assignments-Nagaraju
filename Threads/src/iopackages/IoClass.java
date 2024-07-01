package iopackages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class IoClass {
	public static void main(String[] args) throws IOException {
		InputStream fileInputStream = new FileInputStream("src/iopackages/text.txt");
		Reader inputStreamReader = new InputStreamReader(fileInputStream);
		int fileData = inputStreamReader.read();
		System.out.println("File-1 Data...\n");
		while(fileData!=-1) {
			System.out.println("fileData Ascii : " +fileData+", filedata char : "+(char)fileData);
			fileData = inputStreamReader.read();
		}
		
	}

}
