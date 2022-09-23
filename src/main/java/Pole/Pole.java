package Pole;

import java.util.Random;

public class Pole {

	public static void main(String[] args) {

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = i;
			//num[i] = (int) (Math.random() * 10);
			System.out.println(num[i]);

		}
		int max = 10;
		int min = 0;

		int random = (int) (Math.random() * (max - min + 1) + min);

		System.out.println("nahodne cislo vybrane" + random + "\n");

		boolean found = false;
		for (int n : num) {
			if (n == random) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(random + " Je to tam");
		} else {
			System.out.println(random + " Smola");
		}
	}

}
