package tw.bear.leetcode;

public class WaterFlower {
	static void outputWaterFlower() {
		int hud,ten,one;
		for(int i=100 ; i<1000;i++) {
			one = i%10;
			ten =(i/10)%10;
			hud = (i/100)%10;
			if(Math.pow(one, 3)+Math.pow(ten, 3)+Math.pow(hud, 3)==i)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		outputWaterFlower();
	}
}
