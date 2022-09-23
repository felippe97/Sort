package Sort.MergeSort;

public class MergeSort {
 

	 public void mergeSort(int[] array) {
		 if (array==null) {
			
		}
		 if (array.length > 1) {
			int pol = array.length/2;
			
			int[] lava = new int[pol];
			for(int i = 0; i < array.length; i++) {
				lava[i] = array[i];
			}
			int[] prava = new int[array.length - pol];
			for(int i = pol; i<array.length; i++) {
				prava[i - pol] = array[i];
				
			}
			
			mergeSort(lava);
			mergeSort(prava);
			
			int i = 0;
			int j = 0;
			int k = 0;
			
			while (i < lava.length && j < prava.length) {
			
				
			}
		}
	 }
}
