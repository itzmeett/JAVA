package com.practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSalary implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		
		int value=0;
		if(e1.getSalary() > e2.getSalary()) {
			value=-1;
		}else if(e1.getSalary() < e2.getSalary()) {
			value=1;
		}else if(e1.getSalary()==e2.getSalary()) {
			value=0;
		}
		return value;
		
	}	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>(); 
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setSalary(120000);
		e1.setName("Harsh Chaudhary");
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setSalary(130000);
		e2.setName("Rohan Patel");
		
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setSalary(80000);
		e3.setName("Poojan Patel");
		
		Employee e4 = new Employee();
		e4.setId(4);
		e4.setSalary(35000);
		e4.setName("Meet Patel");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list, new ComparatorSalary());
		
		for(Employee e : list) {
			System.out.println("Id : " +e.getId() + ", Name : "+ e.getName() + ", Salary : "+e.getSalary());
		}	
	}
}	
