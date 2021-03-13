package 作业;

import java.util.Scanner;

public class 作业三角形 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j, i,k,n;
		System.out.println("输入行数n");
		n = scan.nextInt();
		for (i = 0; i < n; i++) {
			for(j=0;j<n-i;j++) {
				System.out.print(" ");
				
			}
			for(k=0;k<i;k++) System.out.print("* ");
			System.out.println(" ");

		}

	}

}
