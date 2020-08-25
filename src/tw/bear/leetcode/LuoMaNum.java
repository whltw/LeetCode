package tw.bear.leetcode;

public class LuoMaNum {
	public static void main(String[] args) {
		System.out.println(luomaNum(58));
	}
	static String luomaNum(int a) {
		int len = String.valueOf(a).length();
		int [] arr = new int[len];
		int i = 0;
		int index = a;
		while(index!=0) {
			arr[i] = index%10;
			index= index/10;
			i++;
		}
		String buff ="";
		if(len == 4) {
			buff = thoMatch(arr[len-1])+hudMatch(arr[len-2])+tenMatch(arr[len-3])+singleMatch(arr[len-4]);
			return buff;
		}
		if(len == 3) {
			buff = hudMatch(arr[len-1])+tenMatch(arr[len-2])+singleMatch(arr[len-3]);
			return buff;
			
		}
		if(len == 2) {
			buff = tenMatch(arr[len-1])+singleMatch(arr[len-2]);
			return buff;
		}
		
		if(len == 1) {
			buff = singleMatch(arr[len-1]);
			return buff;
		}
		return buff;
	}
	
	static String thoMatch(int b) {
		if(b==0)		
			return "";
		if(b> 0&&b <4) {
			String s = "";
			for(int i =1;i<= b; i++) {
				s+="M";
			}
			return s;
		}
		
		
		return "";
	}
	
	static String hudMatch(int b) {
		if(b==0)		
			return "";
		if(b> 0&&b <4) {
			String s = "";
			for(int i =1;i<= b; i++) {
				s+="C";
			}
			return s;
		}
		
		if(b == 4) 
			return "CD";
		if(b==5)
			return "D";
		if(b>5&&b<9) {
			String s = "D";
			for(int i =6;i<= b; i++) {
				s+="C";
			}
			return s;
		}
		if(b==9)
			return "CM";
		return "";
	}
	
	static String tenMatch(int b) {
		if(b==0)		
			return "";
		if(b> 0&&b <4) {
			String s = "";
			for(int i =1;i<= b; i++) {
				s+="X";
			}
			return s;
		}
		
		if(b == 4) 
			return "XL";
		if(b==5)
			return "L";
		if(b>5&&b<9) {
			String s = "L";
			for(int i =6;i<= b; i++) {
				s+="X";
			}
			return s;
		}
		if(b==9)
			return "XC";
		return "";
	}
	
	
	static String singleMatch(int b) {
		if(b==0)		
			return "";
		if(b> 0&&b <4) {
			String s = "";
			for(int i =1;i<= b; i++) {
				s+="I";
			}
			return s;
		}
		
		if(b == 4) 
			return "IV";
		if(b==5)
			return "V";
		if(b>5&&b<9) {
			String s = "V";
			for(int i =6;i<= b; i++) {
				s+="I";
			}
			return s;
		}
		if(b==9)
			return "IX";
		return "";
	}
}
