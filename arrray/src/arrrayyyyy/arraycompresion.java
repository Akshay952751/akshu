package arrrayyyyy;

import java.util.Arrays;

public class arraycompresion {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {6,8,9,25,27};
		int[] c = {1,2,3,4};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(a, c));
	}

}
