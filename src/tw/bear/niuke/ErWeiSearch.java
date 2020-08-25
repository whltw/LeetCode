package tw.bear.niuke;
/**二维数组查找
 * 
 */
import org.junit.Test;

public class ErWeiSearch {
	public boolean Find(int target, int [][] array) {
		//暴力查找 两个循环遍历
		int rowLength=array.length;
		System.out.println(rowLength);
		for(int i = 0;i<rowLength;i++)
		{
			for(int j = 0;j<array[i].length;j++)
			{
				if(array[i][j] == target)
					return true;
			}
			
		}
		return false;
		
		
		
	}
	
	//二分查找
	
	public boolean Erfen(int [] arr,int low,int high,int key) {
		int mid = (low+high)/2;
		if(arr[low]>key||arr[high]<key||low>high)
			return false;
		if(arr[mid]>key) {
			return Erfen(arr,low,mid-1,key);
		}
		if(arr[mid]<key)
			return Erfen(arr,mid+1,high,key);
		if(arr[mid] == key)
			return true;
		return false;
		
	}
	public boolean FindByErfen(int target,int[][] array) {
		int rowLength=array.length;
		System.out.println(rowLength);
		for(int i = 0;i<rowLength;i++)
		{
			boolean re = Erfen(array[i],0,array[i].length-1,target);
			if(re==true)
				return true;
			
			else
				continue;
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		int array[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		ErWeiSearch erWeiSearch = new ErWeiSearch();
		System.out.println(erWeiSearch.FindByErfen(7, array));
	}
}
