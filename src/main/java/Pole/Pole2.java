package Pole;

import java.util.Arrays;

import java.util.Random;

import org.w3c.dom.Element;

public class Pole2 {

	public static void main(String[] args) {
		int d;
		int[] num = new int[10];

		int del;
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		System.out.println("Zakladne pole " + Arrays.toString(num));
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			int r = rand.nextInt(num.length);
			int temp = num[r];
			num[r] = num[i];
			num[i] = temp;

		}

		System.out.println("Prehadzane pole " + Arrays.toString(num));

		int max = 9;
		int min = 0;

		int random = (int) (Math.random() * (max - min + 1) + min);
		int index = random;
		int[] newNum = new int[num.length - 1];
		for (int i = 0, k = 0; i < num.length; i++) {
			if (i != index) {
				newNum[k] = num[i];
				k++;
			}
		}
		System.out.println("Odstraneny index random " + Arrays.toString(newNum));
		System.out.println("nahodny index  " + index + "\n");
		
	
		
		
		
	}

}
