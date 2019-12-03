package helloworld;

public class h1 {
	public static void main(String []args) {
		
		System.out.println("Hello World!");
		
		int N = 100000;
		long start , end;
		start = System.currentTimeMillis();
		Eratosthene.Era(N);
		end = System.currentTimeMillis();
		System.out.println("TIME = "+(end - start)+"ms");
		
		start = System.currentTimeMillis();
		Eratosthene.test3(N);
		end = System.currentTimeMillis();
		System.out.println("TIME = "+(end - start)+"ms");
		
	}
	public static int F(int []a) {
		return a[0];
	}
}
