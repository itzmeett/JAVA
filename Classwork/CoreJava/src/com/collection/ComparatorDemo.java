package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp> {
	public int compare(Emp e1, Emp e2) {
		int value = 0;
		if(e1.getSalary()>e2.getSalary()) {
			value=-1;
		}
		else if(e1.getSalary()<e2.getSalary()) {
			value=1;
		}
		else if(e1.getSalary()==e2.getSalary()) {
			value=0;
		}
		return value;
	}
	
	public static void main(String args[]) {
		ArrayList<Emp> list = new ArrayList<Emp>();
		
		ComparatorDemo e1 = new ComparatorDemo();
		e1.setEid(1);
		e1.setEname("Meet Seth");
		e1.setSalary(1000);
		
		ComparatorDemo e2 = new ComparatorDemo();
		e2.setEid(1);
		e2.setEname("Shyam Tank");
		e2.setSalary(71000);
		
		ComparatorDemo e3 = new ComparatorDemo();
		e3.setEid(1);
		e3.setEname("Rahul Parmar");
		e3.setSalary(25000);
		
		ComparatorDemo e4 = new ComparatorDemo();
		e4.setEid(1);
		e4.setEname("Meet Patel");
		e4.setSalary(35000);
		
		ComparatorDemo e5 = new ComparatorDemo();
		e5.setEid(1);
		e5.setEname("Nixit Tank");
		e5.setSalary(85000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collection.sort(list, new ComparatorDemo());
		for(Emp e:list) {
			System.out.println("EID : "+ e.getEid()+" ENAME :"+ e.getName()+ "SALARY : "+ e.getSalary());
		}
		
		
		
	}
}
