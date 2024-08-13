package chuoi;

import java.util.HashMap;
import java.util.Map;

public class SoLanXuatHienCuKyTu {

	public static Map<Character, Integer> countChar(String s) {
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		char[] charArr = s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			result.put(charArr[i], result.getOrDefault(charArr[i], 0)+1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(countChar(s));

	}

}
