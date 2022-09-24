package Sort.InsertionSort;

import java.util.Random;

import Sort.Stopky.StopWatch;

public class InsertionSort {
	
	
	
	    public static void main(String a[]){
	    	StopWatch stopWatch = new StopWatch();
	    	Long start = stopWatch.start();
	    	Random random = new Random();
			
			 Integer[] data = new Integer[9999];

		      
		      for (int i = 0; i < 9999; i++) {
		    	  data[i] = random.nextInt();

		     
		      }
	    	 int n = data.length;  
		        for (int j = 1; j < n; j++) {  
		            int key = data[j];  
		            int i = j-1;  
		            while ( (i > -1) && ( data [i] > key ) ) {  
		            	data [i+1] = data [i];  
		                i--;  
		            }  
		            data[i+1] = key;  
		        }  
	          
	       
		       
	        
	        for(int i:data){    
	        	System.out.print(i + "\n");    
	        }    
	        Long stop = stopWatch.stop();
            
	        System.out.println("Time"+ stopWatch.getTime(start, stop) + "\n");

}
}
