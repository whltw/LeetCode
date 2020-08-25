package tw.bear.leetcode;

public class NumRevert {
	public static long reverse(int a) {
		
		if(a == 0) 
			return a;
		else {
			String valueOf = String.valueOf(a);
			char[] charArray = valueOf.toCharArray();
			StringBuffer s= new StringBuffer();
			if(a>0) {
				for(int i=charArray.length-1;i>=0;i--) {
					
					s.append(charArray[i]);
					
				}
				try {
				
					int parseInt = Integer.parseInt(s.toString());
					return parseInt;
					
				}catch(NumberFormatException e){
					return 0;
				}
			}
			else if(a<0){
				s.append(charArray[0]);
				for(int i=charArray.length-1;i>0;i--) {
					s.append(charArray[i]);	
				}
				try {
					int parseInt = Integer.parseInt(s.toString());
					return parseInt;
				}catch(NumberFormatException e){
					return 0;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(reverse(-119999));
	}
}
