package com.file;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteerReader {
	public static void main(String args[]) throws IOException, Exception{
		try {	
		FileWriter fw = new FileWriter("File2.txt");
		String s = "This is a file Reader/Writer demo using java";
		fw.write(s);
		fw.close();
		
		FileReader fr = new FileReader("File2.txt");
		int i;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
		fr.close();

		}
		
	catch(Exception e) {
		System.out.println(e);
	}
}
}

