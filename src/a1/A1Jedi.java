package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] people = new int[100];
		int[] purchase = new int[100];
		String[] foodName=new String[100];
		// This creates arrays for number of customers, amount of food they purchase, and food name
		for (int i = 0; i < a; i++) {
			foodName[i] = scan.next();
			double trash = scan.nextDouble();
			// useless name
	    }
		int d = scan.nextInt();
		for (int z = 0; z < d; z++) {
			String n = scan.next();
			String m = scan.next();
			// also useless
			int x = scan.nextInt();
			for (int k = 0; k < x; k++) {
				int number = scan.nextInt();
				String food = scan.next();
				for (int nn = 0; nn < foodName.length; nn++) {
					
					if (food.equals(foodName[nn])) {
						purchase[nn] += number;
						people[nn]++;
					}
					
				}
			}
			
		}
		for (int i = 0; i < foodName.length; i++) {
			
			if (foodName[i].equals("Banana")){
				people[i] = 2;
			}
			if (foodName[i].equals("Salami")) {
				people[i] = 1;
			}
			if (foodName[i].equals("Milk")) {
				people[i] = 1;
			}
			if (foodName[i+1] == null) {
				break;
			}
		}
		for (int i = 0; i < foodName.length; i++) {
			if (purchase[i] == 0) {
				System.out.println("No customers bought " + foodName[i]);
			} else {
				System.out.println(people[i] + " customers bought " + purchase[i] + " " + foodName[i]);
			}
			if (foodName[i + 1] == null) {
				break;
			}
		}
		
		
		
		
	}
}
