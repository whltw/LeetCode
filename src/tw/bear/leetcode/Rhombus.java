package tw.bear.leetcode;
//输出菱形
public class Rhombus {

	static void getRhombus() {
		for(int i=1;i<=5;i++) {
			for(int j =1;j<= 5-i;j++)
				System.out.print(" ");
			for(int k = 1;k<= 2*i-1;k++) 
				System.out.print("*");
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) 
				System.out.print(" ");
			for(int k =1;k<=(4-i)*2+1;k++ )
				System.out.print("*");
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		getRhombus();
	}
}
