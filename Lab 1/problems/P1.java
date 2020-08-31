package problems;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.toLowerCase().charAt(0);
		
		switch(c) {
		case 'a':
			System.out.println("Action movie fan");
			break;
		
		case 'c':
			System.out.println("Comedy movie fan");
			break;
		
		case 'd':
			System.out.println("Drama movie fan");
			break;
		
		default:
			System.out.println("Invalid choice");
			break;
		}
		 

	}

}
