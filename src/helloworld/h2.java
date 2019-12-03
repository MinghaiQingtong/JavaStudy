package helloworld;

public class h2 {
	
	static class C{
		public int a;
		C(int c){a = c;}
	}
	
	public static void A(int a) {
		a++;
	}
	
	public static void A(Integer a) {
		a++;
	}
	
	public static void main(String[] args) {
		int a = 1;
		Integer b = 1;
		A(a);
		A(b);
		System.out.println(a+" "+b);
		
		C c = new C(1);
		
		
	}
}
