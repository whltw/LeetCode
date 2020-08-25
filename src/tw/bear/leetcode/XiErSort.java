package tw.bear.leetcode;

public class XiErSort {
	static int [] xiErSort(int [] arr)
	{
		int i;
		int len =arr.length;
		int temp;
		for(int gap=len/2;gap>0;gap=gap/2) {
			for(int j =gap;j<len;j++) {
				temp = arr[j];
				for(i=j-gap;i>=0;i=i-gap) {
					if(temp<arr[i])
						arr[i+gap] = arr[i];
					else break;
				}
				arr[i+gap] = temp;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int [] arr = {1,5,4,9,7,3,2};
		int[] xiErSort = xiErSort(arr);
		for(int a:xiErSort) {
			System.out.print(a);
		}
	}
}
