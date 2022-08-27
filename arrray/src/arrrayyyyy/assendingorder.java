package arrrayyyyy;

public class assendingorder {
	
	public static void main(String[] args) {
		int hold;
		
		int[] ass= {14,15,10,9,3,2,78,94,56,29,87,30,785,951,7894,1459,3210,78,96,142,368,741,-98,-32,-147,-9874,985};
		
		for(int i = 0; i<ass.length; i++) {
			for(int j= i+1; j<ass.length; j++) {
				if(ass[i] > ass[j]) {
					 hold = ass[i];
					ass[i] = ass[j];
					 ass[j] = hold;
				}
			}
		}
		for(int i = 0; i<ass.length;i++) 
			System.out.print(ass[i]+" ");
		
	}
	
	
	

}
