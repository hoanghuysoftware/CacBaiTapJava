package tim_kiem;

public class tuanTu {

	public static int search(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		int isSearch = search(a, 2);
		if(isSearch >= 0) {
			System.out.println("Tim thay");
		}else {
			System.out.println("Khong thay");
		}
	}

}
