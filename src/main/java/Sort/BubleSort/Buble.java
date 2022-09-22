package Sort.BubleSort;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import Sort.Stopky.StopWatch;

public class Buble {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		StopWatch stopWatch = new StopWatch();
		Long start = stopWatch.start();
		Integer d;

		Random random = new Random();

		Integer[] array = new Integer[9999];

		for (int i = 0; i < 9999; i++) {
			array[i] = random.nextInt();

		}

		Integer[] data = array;

		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[j].compareTo(data[i]) < 0) {
					d = data[j];
					data[j] = data[i];
					data[i] = d;

				}

			}

			System.out.print(data[i] + "\n");

		}
		Long stop = stopWatch.stop();
		System.out.print("Time" + stopWatch.getTime(start, stop) + "\n");
		System.out.print("O(n^{2})" + "kvadratická" + "\n");
	}
}
