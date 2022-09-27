package Pole;

import java.util.Arrays;
import java.util.Random;

public class Pole3 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		System.out.println("Zakladne pole " + Arrays.toString(num));

		/*
		 * Integer[] data = new Integer[num.length]; for (int i = 0; i < data.length;
		 * i++) { for (int j = i + 1; j < data.length; j++) { if
		 * (data[j].compareTo(data[i]) > 0) { d = data[j]; data[j] = data[i]; data[i] =
		 * d;
		 * 
		 * }
		 * 
		 * } }
		 */
		int data1 = num.length;
		int[] lava = new int[(data1 + 1) / 2];
		int[] prava = new int[data1 - lava.length];
		for (int i = 0; i < data1; i++) {
			if (i < lava.length) {
				lava[i] = num[i];
			} else {
				prava[i - lava.length] = num[i];
			}

		}
		System.out.println(Arrays.toString(lava) + Arrays.toString(prava));

		Random rand = new Random();
		for (int i1 = 0; i1 < num.length; i1++) {
			int r = rand.nextInt(num.length);
			int temp = num[r];
			num[r] = num[i1];
			num[i1] = temp;

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

	}
}