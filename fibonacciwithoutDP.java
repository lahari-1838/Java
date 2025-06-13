package ABC;

public class fibonacciwithoutDP {
	public static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-1);
		
	}
	public static void main (String[] args) {
		int n=6;
		System.out.println("fibonaci of"+n+"is"+fib(n));
	}

}
