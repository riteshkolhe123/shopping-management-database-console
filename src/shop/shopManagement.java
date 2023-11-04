package shop;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import product.productManagement;

public class shopManagement {
	public static void main(String args[]) throws IOException, SQLException {
		Scanner sc = new Scanner(System.in);

		boolean CanIKeepRunningTheProgram = true;
		System.out.println("!!!! WELCOME TO SHOP MANAGEMENT !!!!");
		System.out.print("Login Details!!!");
		System.out.println("\n");
		System.out.println("Enter login name :");
		String loginName = sc.nextLine();
		System.out.println("Enter Password :");
		String password = sc.nextLine();

		if(!user.userManagement.ValidateUserAndPassword(loginName, password)) {
			System.out.println("!!!! LOGIN FAILED. CLOSING THE APPLICATION !!!!");
			return;
		}
		else {
			System.out.println("Login Successful");
		}
		while(CanIKeepRunningTheProgram == true) {
			System.out.println("!!! WELCOME TO SHOP MANAGEMENT !!!");
			System.out.println("\n");

			System.out.println("WHAT WOULD YOU LIKE TO DO");
			System.out.println("1. User Management");
			System.out.println("2. Product Management");
			System.out.println("3. Quit");

			int OptionSelectedByUser = sc.nextInt();

			if(OptionSelectedByUser == 1) {
				user.userManagement.Usermanagement();
			}
			else if(OptionSelectedByUser == 2) {
				productManagement.productmanagement();
			}
			else if(OptionSelectedByUser == 3) {
				break;
			}
		}
	}
}
