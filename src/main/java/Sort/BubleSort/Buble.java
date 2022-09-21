package Sort.BubleSort;

import java.io.FileNotFoundException;

import java.io.IOException;

import org.openjdk.jmh.annotations.BenchmarkMode;

public class Buble {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Integer d;

		Integer[] data = { -769214442, -1283881723, 1504158300, -1260321086, -1800976432, 1278262737, 1863224321,
				1895424914, 2062768552, -1051922993, 751605209, -1500919212, 2094856518, -1014488489, -931226326,
				-1677121986, -2080561705, 562424208, -1233745158, 41308167, 5159529, 524951951, 81429495, 799526,
				7226445, 249929287 };
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[j].compareTo(data[i]) < 0) {
					d = data[j];
					data[j] = data[i];
					data[i] = d;

				}
			}
			System.out.println(data[i]);
		}
	

	}

}
