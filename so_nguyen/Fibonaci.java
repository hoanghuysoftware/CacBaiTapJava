package so_nguyen;

public class Fibonaci {
	//C1: phương thức để in ra n số đầu tiên của dãy Fibonacci.
	public static void Fibonanci(int n) {
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(" " + a);
			int next = a+b;
			a = b;
			b = next;
		}
		System.out.print("\n " + a);
	}
	//C2: In ra so Fibonacci  thu n
	public static int FibonacciN (int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return FibonacciN(n-1) + FibonacciN(n-2);
	}

	public static void main(String[] args) {
//C1		Fibonanci(5);
//		System.out.println("\nThu n: "+ FibonacciN(10));
//C2		for(int i=0; i<5; i++) {
//			System.out.println(FibonacciN(i));
//		}
	}
}
