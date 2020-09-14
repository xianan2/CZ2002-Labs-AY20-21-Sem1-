package Lab2p1;

import java.util.Scanner;

public class Lab2p1 {
	public static void main(String[] args){
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: miltiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
			
			switch (choice) {
				 case 1: /* add mulTest() call */
					 multest();
					 break;
				 case 2: /* add divide() call */
					 int m = sc.nextInt();
					 int n = sc.nextInt();
					 
					 int q = divide(m,n);
					 System.out.printf("%d/%d = %d\n", m, n, q);
					 break;
				 case 3: /* add modulus() call */
					 m = sc.nextInt();
					 n = sc.nextInt();
					 
					 int r = modulus(m,n);
					 System.out.println(m + " % " + n + " = " + r);
					 break;
				 case 4: /* add countDigits() call */
					 int output = countDigits(sc.nextInt());
					 
					 if (output == -1)
						 System.out.println("Error input!!");
					 else
						 System.out.printf("count = %d\n", output);
					 break;
				 case 5: /* add position() call */
					 System.out.printf("position = %d\n",position(sc.nextInt(),sc.nextInt()));
					 break;
				 case 6: /* add extractOddDigits() call */
					 long result = extractOddDigits(sc.nextLong());
					 
					 if (result == -2)
						 System.out.println("oddDigits = Error input!!");
					 else
						 System.out.printf("oddDigits = %d\n", result);
					 break; 
				 case 7: System.out.println("Program terminating ….");
			}
		} while (choice < 7);
	}
	
 /* add method code here */
	public static void multest() {
		int correctCount = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			int num1 = (int)(Math.random() * 10);
			int num2 = (int)(Math.random() * 10);
			
			System.out.printf("How much is %d times %d?", num1 , num2);

			if(sc.nextInt() == num1 * num2) {
				correctCount++;
			}
		}
		
		System.out.printf("%d answers out of 5 are correct.\n", correctCount);
		
	}
	
	public static int divide(int m, int n) {
		int quotient = 0;
		
		while(m >= n && m > 0) {
			m -= n;
			quotient++;
		}
		
		return quotient;
	}
	
	public static int modulus(int m, int n) {
		while(m >= n && m > 0) {
			m -= n;
		}
		
		return m;
	}
	
	public static int countDigits(int n) {
		int count = 0;
		
		if(n <= 0) 
			return -1;
				
		while(n != 0) {
			n /= 10;
			count++;
		}
		
		return count;
	}
	
	public static int position(int n, int digit) {
		int pos = 0;
		
		while(n != 0) {
			pos++;
			
			if(n % 10 == digit) 
				return pos;
			else
				n /= 10;
		}
		
		return -1;
	}
	
	public static long extractOddDigits(long n) {
		long oddDigits = 0;
		double powerCount = 0;
		
		if(n < 0)
			return -2;
		
		while(n != 0) {
			long lastDigit = n % 10;
			
			if (lastDigit % 2 == 1) {
				oddDigits = oddDigits + lastDigit * (long)Math.pow(10, powerCount);
				powerCount++;
			}
			n /= 10;
		}
		
		if(oddDigits == 0)
			return -1;
		else
			return oddDigits;
	}
}
