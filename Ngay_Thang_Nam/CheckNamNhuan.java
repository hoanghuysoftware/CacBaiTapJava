package Ngay_Thang_Nam;

import java.util.Scanner;

public class CheckNamNhuan {

	public static boolean check(int n) {
		if (n % 4 == 0 || n % 100 == 0 && n % 400 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao nam can kiem tra: ");
		int n = sc.nextInt();

		System.out.println("Ket qua: " + check(n));
	}
}
