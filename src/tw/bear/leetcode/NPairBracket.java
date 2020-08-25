package tw.bear.leetcode;

public class NPairBracket
{
	static String  a = "";
	public static String pairBracket(int n) {
		if(n==0) {
			return")";
		}
		a+="(";
		pairBracket(n-1);
		a+=")";
		return a;
	}
	public static void main(String[] args) {
		System.out.println(pairBracket(3));
		System.out.println(pingfang(3));
	}
	
	public static int pingfang(int n) {
		if(n==1)
			return n;
		return n*n+pingfang(n-1);
	}
	
}
