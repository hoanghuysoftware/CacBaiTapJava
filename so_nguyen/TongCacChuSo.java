package so_nguyen;

public class TongCacChuSo {

	public static void main(String[] args) {
		int n = 1001;
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println("Tong: " + sum);

	}

}
