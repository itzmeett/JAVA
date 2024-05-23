package com.assignments;
import java.util.Scanner;

public class Member {
	
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
 
//    	name = nm;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
//        Member member = new Member("Meet Patel", 22, "9687084888", "Ahmedabad", 50000);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        Member member = new Member(name, age, phoneNumber, address, salary);

        System.out.println("\nMember Details:\n");
        System.out.println("Name: " + member.getName());
        System.out.println("Age: " + member.getAge());
        System.out.println("Phone Number: " + member.getPhoneNumber());
        System.out.println("Address: " + member.getAddress());
        
        member.printSalary();
        scanner.close();
    }
}

