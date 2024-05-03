package com.file;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class BufferedIOstream {
	public static void main(String args[]) {
		try {
			FileOutputStream fost = new FileOutputStream("BufferedFile.txt");
			BufferedOutputStream bost = new BufferedOutputStream(fost);
			String s = "Hello I am from Bufeered File";
			byte b[] = s.getBytes();
			bost.write(b);
			bost.flush();
			bost.close();
			fost.close();
			System.out.println("File write a successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
		
//		try {
//			System.out.println("___________________________________________\n");
//			FileInputStream fist = new FileInputStream("BufferedFile.txt");
//			BufferedInputStream bist = new BufferedInputStream(fist);
//			int character;
//			while((character = bist.read())!=-1) {
//				System.out.print((char)character);
//			}
//			System.out.println("\nFile Successfully Readed");
//			bist.close();
//		}catch(Exception e){
//			System.out.println(e);	
//		}
	}
}
