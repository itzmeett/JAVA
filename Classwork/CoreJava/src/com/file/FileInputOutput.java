package com.file;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileInputOutput {
	
	public static void main(String args[]) throws IOException{
		
		FileOutputStream fos = new FileOutputStream("File1.txt");
		String s= "This is a file input/output demo using java";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File Written Successfully");
		
		FileInputStream fis = new FileInputStream("File1.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
		fis.close();
		
	}
}
