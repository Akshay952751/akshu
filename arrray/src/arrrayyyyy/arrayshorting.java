package arrrayyyyy;

import java.util.Arrays;

public class arrayshorting {
	
	public static void main(String[] args) {
		int[] a= {12,16,17,19,359,741,985,317,297,612,352,46,298,751,123,46,52,87,-89,-31,-92,-35,-15,-34,359,45,75};
		
		Arrays.sort(a);
		
		for(int i =0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		
		for(int i=a.length-1; i>=0; i--)
			System.out.print(a[i]+" ");
	}
	
	

}
