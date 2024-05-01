package com.core;
import java.util.Scanner;

public class Bank {
	public static void main(String args[]) {
		CheckingAccount c = new CheckingAccount(101, 1000, "Meet");
		double amount;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("*****************************************************");
		System.out.println("1. Deposit");
		System.out.println("2. Withraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		System.out.println("*****************************************************");
		System.out.println("Enter Your Choice : ");
		choice = sc.nextInt();
		System.out.println("*****************************************************");
		
		switch(choice){
		case 1:
			System.out.println("Enter Deposit Ammount : ");
			amount = sc.nextDouble();
			c.deposit(amount);
			System.out.println("*****************************************************");
			break;
			
		case 2:
			System.out.println("Enter Withrawale ammount : ");
			amount = sc.nextDouble();
			try {
				c.withdraw(amount);
			}
			catch(InsufficientFunds e) {
				System.out.println("Soory you need another "+ e.getAmount() + " Rs.");
				
			}
			System.out.println("*****************************************************");			
			break;
			
		case 3:	
			c.checkBalance();
			break;
			
		case 4:
			System.out.println("Thank you for using services");
			System.out.println("*****************************************************");
			break;
			
			default:
					System.out.println("Invalid choice. Please try again");
					System.out.println("*****************************************************");
				}
				if(choice == 4) {
					break;
				}
			}
		}
	}

