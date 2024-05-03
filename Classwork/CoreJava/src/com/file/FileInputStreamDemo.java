package com.file;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamDemo {
	public static void main(String args[]) {
		try {
			FileOutputStream fos = new FileOutputStream("Demo1");
			String s1 = "Hello My name is Meet Patel";
			byte b[] = s1.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
			
			
			FileInputStream fis = new FileInputStream("Demo1");
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception e){
			System.out.println(e);
			
		}
	}
}
