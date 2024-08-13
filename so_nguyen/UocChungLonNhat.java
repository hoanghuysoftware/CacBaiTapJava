package so_nguyen;

import java.util.Scanner;

public class UocChungLonNhat {
	public static int uocchung(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 2 so can tim: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Uoc chung lon nhat: " +uocchung(a,b));
		sc.close();
	}

}
