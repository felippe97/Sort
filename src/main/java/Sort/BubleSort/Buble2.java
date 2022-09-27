package Sort.BubleSort;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import Sort.Stopky.StopWatch;

public class Buble2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Integer d;

		Integer[] array = {1,2,3,4,5,6,7,8,9,10};

	
		Integer[] data = array;

		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[j].compareTo(data[i]) > 0) {
					d = data[j];
					data[j] = data[i];
					data[i] = d;

				}

			}

			System.out.print(data[i] + "\n");

		}
	}
}
