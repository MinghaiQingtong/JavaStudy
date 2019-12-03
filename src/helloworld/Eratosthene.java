package helloworld;

public class Eratosthene {
	public static int Era(int end) {
		int[] mark = new int[end+1];
		int low = 2 , high = end;
		int sum = end - 1;
		for(int i = 2 ; i*i <= end ; i++) {
			if(mark[i] == 1)
				continue;
			for(int j = i*i ; j <= end ; j+=i) {
				if(mark[j] == 0) {
					mark[j] = 1;
					sum--;
				}
			}
		}
		System.out.println("Era : sum = "+sum);

		
		
		return 0;
	}
	
	public static void test3(int N) {
		int sum = 0;
		for (int i = 2;i<= N;i++){//1既不是质数也不是和数，所以从2开始
			boolean k = true;
	        for (int n = 2; n < i; n++) {
	        	if (i % n == 0) {
	        		k = false;
	                break;
	             }
	        }    
	        if(k){
	        	sum++;
	           // System.out.print(i + " ");
	        }
	     }
		System.out.println("test3 : sum = "+sum);
	 }
	
}
