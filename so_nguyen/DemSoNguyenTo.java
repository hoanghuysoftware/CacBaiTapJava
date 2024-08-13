package so_nguyen;

public class DemSoNguyenTo {

	public static boolean isPrimes(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int countPrimes(int[] a) {
		int count = 0;
		for (int item : a) {
			if (isPrimes(item))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] a = { };
		System.out.println("So luong: "+ countPrimes(a));
	}
}
