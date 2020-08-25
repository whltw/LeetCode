package tw.bear.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class ThreeNumAdd {
	public static void main(String[] args) {
		int[] arr = {1,-2,1,0,2,-2};
		List<List<Integer>> threeSum = threeSum(arr);
		for(List<Integer> list: threeSum)
		{
			for(int a :list) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>>  threeSum(int [] arr) {
		int len = arr.length;
		List<List<Integer>> allList = new ArrayList<List<Integer>>();
		if(arr.length<3)
			System.out.println("输入有问题");
		else {
			for(int i = 0;i<len-2;i++) {
				for(int j =i+1;j<len-1;j++) {
					for(int k = j+1;k<len;k++) {
						if(arr[i]+arr[j]+arr[k]==0) {
							List<Integer> list = new ArrayList<Integer>();
							list.add(arr[i]);
							list.add(arr[j]);
							list.add(arr[k]);
							Collections.sort(list);
							if(!allList.contains(list))	
								allList.add(list);
							
						}

						
					}
				}
			}
		}
		return allList;
	}
}
