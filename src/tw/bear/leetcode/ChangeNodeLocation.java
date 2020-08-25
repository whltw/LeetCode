package tw.bear.leetcode;

public class ChangeNodeLocation {
	public static void change(LinkNode l1) {
		LinkNode l2copy = l1.next;
		int i=1;
		if(i==1)
		{
			LinkNode ln = l1.next.next;
			
			l1.next.next  = l1;
			l1.next =ln;
			
		}
		while(l2copy!=null) {
			System.out.println(l2copy.val);
		}
	}
	public static void main(String[] args) {
		LinkNode linkNode1 = new LinkNode(1);
		LinkNode linkNode2 = new LinkNode(2);
		linkNode1.next = linkNode2;
		linkNode2.next =null;
		change(linkNode1);
	}
}
