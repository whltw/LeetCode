package tw.bear.leetcode;

import java.util.HashMap;
//判断字符串a1中是否包含a2的字符串
public class TheSameStr {
	static void getSameStr(String a1,String a2) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int length = a2.length();
		for(int i=0;i<a1.length()-2;i++) {
			String substring = a1.substring(i, i+length);	
			System.out.println(substring);
			map.put(substring, 1);
		}
		if(map.containsKey(a2)) {
			System.out.println("11111");
		}
	}
	public static void main(String[] args) {
		getSameStr("abcd", "ab");
	}
}
