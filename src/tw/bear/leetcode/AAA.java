package tw.bear.leetcode;
/**
 * 
 * @author whltw
 *
 */
public class AAA {
	int x =12;
	public void me(int x) {
		x+=x;
		System.out.println(x);
	}
	public static void main(String[] args) {
//		AAA aaa = new AAA();
//		aaa.me(5);
//		for(int i=0;i<=3;i++) {
//			if(i==2)
//				continue;
//			System.out.println(i);
//		}
//		//System.out.print(""	"");
		Super super1 = new Super();
		System.out.println(super1.getLength());
		Son son = new Son();
		System.out.println(son.getLength());

	}
}

class Super{
	
	public int getLength() {
		return new Integer(4);
	}
}
class Son extends Super{
	public int getLength() {
		return new Integer(5);
	}
}