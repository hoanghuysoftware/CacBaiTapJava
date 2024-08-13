package so_nguyen;

import java.util.Scanner;

public class GiaiThua {
	
	public static int giaithua(int n) {
		if(n==0) return 1;
		return n*giaithua(n-1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so n: ");
		int n = sc.nextInt();
		System.out.println("\nKet qua: "+giaithua(n));
	}
}
