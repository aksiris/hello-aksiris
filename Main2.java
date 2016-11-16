package test;

public class Main2 {

	static int[] f = new int[10000000];
	
	public static void main(String[] args) {
		for(int i = 0; i < 15; i++) {
			System.out.print(GF(3,4,i) + " ");
		}
		//
	}
	
	public static int GF(int a, int b, int n) {
		int x = n == 0? 1 : fib(n-1);
		int y = fib(n);
		return (x*a) + (y*b);
	}
	
	public static int fib(int n) {
		if(n == 0)
			f[n] = 0;
		else if(n == 1 || n == 2)
			f[n] = 1;
		else if(f[n] == 0) {
			int k;
			if(n % 2 == 0) {
				k = n / 2;
				f[n] = (2*fib(k-1) + fib(k)) * fib(k);
			} else {
				k = (n + 1) / 2;
				f[n] = (fib(k-1) * fib(k-1)) + (fib(k) * fib(k));
			}
		}
		return f[n];
	}

}
