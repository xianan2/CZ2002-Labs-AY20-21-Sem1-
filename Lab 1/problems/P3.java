package problems;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int step = sc.nextInt();
		
		if(end < start) {
			System.out.println("Error Input!!");
		}
		else {
			System.out.println("US$         S$\n" + "--------------");
			for (int i = start; i <= end; i += step) {
				System.out.printf("%-2d         %.2f\n", i, (i*1.82));
			}
			
			int tmp = start;
			System.out.println("US$         S$\n" + "--------------");
			while (tmp <= end) {
				System.out.printf("%-2d         %.2f\n", tmp, (tmp*1.82));
				tmp += step;
			}
			
			System.out.println("US$         S$\n" + "--------------");
			do {
				System.out.printf("%-2d         %.2f\n", start, (start*1.82));
				start += step;
			} while (start <= end);
		}

	}

}
