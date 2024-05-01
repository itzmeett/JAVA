package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IoException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int rno;
	String name;
	double per;
	public void Student(int rno, String name, double per) {
		this.rno= rno;
		this.name = name;
		this.per = per;
	}
	public String toString() {
		return "Roll no : "+rno+"\nStudent Name :"+name+"\nPercentage : "+per;
	}
}

public class Serialization{
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Student s1 = new Student(1, "Meet", 89.45);
		
		FileOutputStream fos = new FileOutputStream("File3.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.flush();
		oos.close();
		
		System.out.println("Object Wriiten Successfully");
		
		FileInputStream fis = new FileInputStream("File3.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s2 = (Student) ois.readObject();
		System.out.println(s2);
		ois.close();
	}
}
