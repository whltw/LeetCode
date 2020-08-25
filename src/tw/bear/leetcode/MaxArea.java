package tw.bear.leetcode;

public class MaxArea {
	static int maxArea(int[] arr) {
		int maxArea = 0;
		int preMaxArea = 0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>=arr[i]) {
					preMaxArea = (j-1)*arr[i];
				}
				else {
					preMaxArea = (j-i)*arr[j];
				}
				if(maxArea < preMaxArea)
					maxArea = preMaxArea;
			}
		}
		return  maxArea;
	}
	
	public static void main(String[] args) {
		int[] arr= {3,7,7,4};
		System.out.println(maxArea(arr));
	}
}
