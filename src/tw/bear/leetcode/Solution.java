package tw.bear.leetcode;

class Solution {
    public static String convert(String s, int numRows) {
      String result ="";
      if(s.length()==0||numRows==0||numRows==1)
    	  return s;
      int gaps = 2*(numRows-1);
      for(int i =0;i<numRows;i++) {
    	  for(int j=i;j<s.length();j+=gaps) {
    		  result+=s.charAt(j);
    		  if(i!=0&&i!=numRows-1 && j-2*i+gaps<s.length()) 
    			  result+=s.charAt(j-2*i+gaps);
    		  
    	  }
      }
      return result ;
    }
    public static void main(String[] args) {
		System.out.println(convert1("abcdefgh", 3));
	}
    public static String convert1(String s, int numRows) {
        int len = s.length();
        int nodeLen = 2*numRows-2;//两整列之间的差 也就是等差数列中的d
        String result = "";

        if (len == 0 || numRows == 0 || numRows == 1)//特殊情况特殊处理
            return s;

        for (int i = 0; i < numRows; i++)//从第一行遍历到最后一行
            for (int j = i; j < len; j += nodeLen) {
                result += s.charAt(j);//第一行和最后一行 还有普通行的整列数字
                if (i != 0 && i != numRows-1 && j - 2*i + nodeLen < len)
                    result += s.charAt(j - 2*i + nodeLen);//单列行的数字
            }

        return result ;
    }
}
