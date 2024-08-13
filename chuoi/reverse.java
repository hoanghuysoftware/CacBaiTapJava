package chuoi;

public class reverse {

	public static String reverseString(String s) {
		char[] charArr = s.toCharArray();
		int left = 0, right = charArr.length-1;
		while (left < right) {
			char temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
			left++;
			right--;
		}
		return new String(charArr);
	}

	public static void main(String[] args) {
		String s = "Hello, World!";
		System.out.println(reverseString(s));
	}

}
