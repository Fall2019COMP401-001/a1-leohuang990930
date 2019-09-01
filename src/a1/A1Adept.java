package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String[] name = null;
		
		double[] amount = null;
		
		String[] goodName=null;
		double[] goodPrice=null;
		for (int i = 0; i < a; i++) {
			goodName [i] = scan.next();
			goodPrice[i]= scan.nextDouble();
	    }
		int d = scan.nextInt();
		for (int z = 0; z < d; z++) {
			String n = scan.next();
			String m = scan.next();
			String combined = n + " " + m;
			name[z] = combined;
			
			int x = scan.nextInt();
			double individual = 0;
			for (int k = 0; k < x; k++) {
				int number = scan.nextInt();
				String food = scan.next();
				for (int i = 0; i < goodName.length; i++) {
					if (food.contentEquals(goodName[i])) {
						individual += number*goodPrice[i];
					}
				}
				
			}
		amount[z] = individual;
		}
		double max = amount[0];
		double min = amount[0];
		double average = 0;
		for (int i = 0; i < amount.length; i++) {
			average += amount[i];
			if (amount[i] > max) {
				max = amount[i];
			}
			if (amount[i] < min) {
				min = amount[i];
			}
		}
		average = average/d;
		String maxName = "";
		String minName = "";
		for (int i = 0; i < amount.length; i++) {
			if (amount[i] == max) {
				maxName = name[i];
				
			}
			if (amount[i] == min) {
				minName = name[i];
				
			}
				
		}
		
		System.out.println("Biggest:" + " " + maxName + "(" + max + ")");
		System.out.println("Smallest:" + " " + minName + "(" + min + ")");
		System.out.println("Average:" + " " + average);
	}
}
