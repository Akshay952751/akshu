package arrrayyyyy;

public class decendingorder {
	
	public static void main(String[] args) {
		
		int hold;
		
		int[] dec = {12,71,96,4,35,86,74,12,63,22,89,64,145,318,-74,-38,-1,-248,-54,354,961,746,97};
		
		for(int i = 0;i<dec.length;i++) {
			for(int j =i+1; j<dec.length;j++) {
				if(dec[i] < dec[j]) {
					hold= dec[i];
					dec[i]=dec[j];
					dec[j]=hold;
				}
					
				}
			}
		
		for(int i=0;i<dec.length;i++)
			System.out.print(dec[i]+" ");
	}

}
