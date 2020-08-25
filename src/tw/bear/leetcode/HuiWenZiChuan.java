package tw.bear.leetcode;
/**
 * 
 * @author whltw
 *给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 *输入: "babad" 输出: "bab" 注意: "aba"也是一个有效答案
 */
public class HuiWenZiChuan {
	public static String SonString(String s) {
		String result="";
		String cur = "";
		String curResult="";
		for(int start = 0; start<s.length();start++) {
			System.out.println("mmd"+cur.length());
			cur = s.substring(start, start+1);	
			for(int end = start+1; end <s.length();end++) {
				if(!cur.equals(s.substring(end,end+1))) 
					continue;
				else {
					curResult = s.substring(start,end+1);
					System.out.println("11"+curResult);
					if(curResult.length()>result.length()) {
						result = curResult;
						break;
					}
				}	
				
			}
		}
		if(result.length()==0) {
			result = s.substring(0,1);
		}
		System.out.println("最终结果"+result);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(SonString("ac"));
	}
}
