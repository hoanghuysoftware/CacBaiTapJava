package chuoi;

public class Doi_Xung {

	public static boolean isPalindrome(String s) {
		char[] charArr = s.toCharArray();
		int midIndex = s.length()/2 + 1; // get center string
		int left = 0, right = s.length() - 1;

		if (s.length() % 2 == 0)
			return false;
		while (left < midIndex) {
			if (charArr[left] != charArr[right])
				return false;
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "ab";
		System.out.println(isPalindrome(s));

	}

}
