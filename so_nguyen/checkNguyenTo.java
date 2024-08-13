package so_nguyen;

import java.util.Scanner;

public class checkNguyenTo {

	public static boolean check(int n) {
		 if (n <= 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Nhap so kiem tra: ");
		int n = sc.nextInt();
		if(check(n)) {
			System.out.print("\n"+n+" La so nguyen to");
		}else {
			System.out.print("\n"+n+" Khong la so nguyen to");
		}
	}

}
