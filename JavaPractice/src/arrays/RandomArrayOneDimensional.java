package arrays;

import java.util.Random;

public class RandomArrayOneDimensional {

	public static void main(String[] args) {
	 
		Random r=new Random();
		int a[]=new int[50];
		for(int i=0; i<a.length;i++) {
			
			a[i]=r.nextInt(50);
		}
       for(int j: a) {
    	   System.out.println(j);
    	   
       }
		
		
	}

}
