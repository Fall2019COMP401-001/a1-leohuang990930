package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		for (int i = 0; i < a; i++) {
			String b=scan.next();
			String c=scan.next();
			double d=scan.nextInt();
			double total=0.00;
			for (int z = 0; z < d; z++) {
				int e=scan.nextInt();
				String f=scan.next();
				double g=scan.nextDouble();
				double h = e*g;
				total +=h;
			}
			System.out.println(b.substring(0, 1) + "." + " " + c + ": " + total);
		}
	}
}