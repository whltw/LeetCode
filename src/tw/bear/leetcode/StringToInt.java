package tw.bear.leetcode;

public class StringToInt {
	static int revert(String str) {
		String replace = str.replace(" ", "");
		if(replace.equals("")||replace.equals(null))
			return 0;
		StringBuffer s = new StringBuffer();
		for(int i=0;i<replace.length();i++) {
			char charAt = replace.charAt(i);
			if(i==0&&String.valueOf(charAt).equals("-")) {
				s.append(charAt);
			}
			else if((i==0||i==1)&&((int)charAt<48 ||(int)charAt>57))
				return 0;
			else if((int)charAt>=48&&(int)charAt<=57) {
					s.append(charAt);
			}
			else {
				break;
			}	
		}
		
		try {
			int parseInt = Integer.parseInt(s.toString());
			return parseInt;
		} catch (NumberFormatException e) {
			if(!s.substring(0,1).equals("-"))
				return (int) (Math.pow(2, 31)-1);
			else {
				return (int)(-Math.pow(2, 31));
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(revert(" -2.1123"));
	}
}
