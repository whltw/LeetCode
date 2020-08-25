package tw.bear.leetcode;

public class DeleteCopyNum {
	static int deleteNum(int[] arr) {
		int temp = arr.length;
		int  i =0;
		int len =arr.length;
		while(i<len-1) {
			if(arr[i]==arr[i+1]) 
				temp--;
			i++;
			
				
			
			
			
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,3,4};
//		int[] deleteNum = deleteNum(arr);
//		for(int a:deleteNum) {
//			System.out.println(a);
//		}
		System.out.println(deleteNum(arr));
	}
}
