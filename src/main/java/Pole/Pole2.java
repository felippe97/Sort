package Pole;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Pole2 {

	public static void main(String[] args) {

		int[] num = new int[10];
		int del;
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			int r = rand.nextInt(num.length);
			int temp = num[r];
			num[r] = num[i];
			num[i] = temp;
			
		}
		System.out.println(Arrays.toString(num));
		
		del =  num.length - 1;
		System.out.println(del);
		
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
