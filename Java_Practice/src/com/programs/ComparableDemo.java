package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
	private String name;
	int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public int compareTo(Student that)
	{
		if(this.age==that.age) {
			return 0;
		}
		else if(this.age>that.age) {
			return 1;
		}else {
			return -1;
		}
//		return this.name.compareTo(that.name);
	}

}

public class ComparableDemo {
	public static void main(String[] args) {
		
		ArrayList<Student> lst = new ArrayList<>();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.setName("Meet Patel");
		s1.setAge(25);
		
		s2.setName("Pujan Patel");
		s2.setAge(22);
		
		s3.setName("Aakash Patel");
		s3.setAge(28);
		
		s4.setName("Rohan Patel");
		s4.setAge(26);
		
		lst.add(s1);
//		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		
		Comparator<Student> c = new Comparator<Student>() {
			public int compare(Student s1, Student s3) {
				return s1.getName().compareTo(s3.getName());
			}
		};
		
		Collections.sort(lst, c);
		for(Student s: lst) {
			System.out.println("Name : " + s.getName() + ", Age : " + s.getAge());
		}
	}
}
