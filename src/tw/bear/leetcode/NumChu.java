package tw.bear.leetcode;

public class NumChu {
	static void chuFa(int num1,int num2) {
		int abs = Math.abs(num1);
		int abs2 = Math.abs(num2);
		int count=1;
		int chushu = abs2;
		while(num1>chushu<<1) {
			System.out.println("11111");
			chushu<<=1;
			count<<=1;
		}
		chushu+=num2;
		while(num1>chushu) {
			count++;
			chushu+=num2;
		}
		
			
		System.out.println(count);
	}
	public static void main(String[] args) {
		chuFa(200, 3);
		int a=1;
		System.out.println(a<<2);
		String id = String.format("%-4d",11);
        System.out.println(id);
	}
}
