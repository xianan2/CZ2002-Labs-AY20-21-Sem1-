package problems;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int h = sc.nextInt();
		
		if (h < 1)
			System.out.println("Error Input!!");
		// If-else statement on whether i is odd or even to concatenate "AA" or "BB" after printing every line
		// Reduces to one loop only
		else {
			for(int i = 1; i <= h; i++) {
				for(int j = 1; j <= i; j++) {
					if (i % 2 == 1) {
						if (j % 2 == 1)
							System.out.print("AA");
						else
							System.out.print("BB");
					}
					else {
						if (j % 2 == 1)
							System.out.print("BB");
						else
							System.out.print("AA");
					}
				}
				System.out.println("");
			}
		}
	}

}
