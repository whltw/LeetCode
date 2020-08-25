package tw.bear.leetcode;

public class PublicPrefix {
	public static void main(String[] args) {
		String [] arr = {""};
		System.out.println(findPubFix(arr));
	}
	static String findPubFix(String[] arr) {
		String s = "";
		if(arr.length==0||arr[0].equals("") )
			return s;
		if(arr.length ==1)
			return String.valueOf(arr[0].charAt(0));
		int len = arr.length;
		
		int minlen =arr[0].length();
		
		for(int i=1;i<len;i++) {
			if(arr[i].length()<minlen)
				minlen = arr[i].length();
		}
		
		String buff ="";
		for(int j = 0;j < minlen;j++) {
			
			for(int k = 1; k<len;k++) {
				if(arr[0].charAt(j) ==arr[k].charAt(j) ) {
					if(k==(len-1))
						buff+=arr[0].charAt(j);	
					else {
						continue;
					}
				}
				else {
					return buff;
				}	
			}
		}
		return buff;
	}
}
