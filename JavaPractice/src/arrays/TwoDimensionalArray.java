package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//int a[][]=new int[3][4];
		int a[][]= {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
		
		//Using for loop
		
		/*for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++)
			System.out.println(a[i][j]+" ");
		}
		System.out.println(" ");*/
		
		//Using Enhanced For Loop
		
		for (int i[] : a) {
			for (int j : i)
			System.out.println(j);
		}
		
	}

}
