package tw.bear.leetcode;

import java.util.Stack;

public class KNodeChange {
	static LinkNode Kswap(LinkNode l1,int k) {
		Stack<LinkNode> stack = new Stack<LinkNode>();
		LinkNode head = l1;
		LinkNode newNode = new LinkNode(0);
		LinkNode newHead = newNode;
		
		int i=0;
		while(head!=null) {
			if(i>0&&i%k==0||head.next==null) {
				while(!stack.isEmpty()) {
					LinkNode temp = stack.pop();
					System.out.println(temp.val);
					newNode.next = temp;
					newNode = newNode.next;
				}
				
			}
			stack.push(head);
			head= head.next;
			i++;
			
			
		}
		return newHead.next;
	}
	public static void main(String[] args) {
		LinkNode node1 = new LinkNode(1);
		LinkNode node2 = new LinkNode(2);
		LinkNode node3 = new LinkNode(3);
		LinkNode node4 = new LinkNode(4);
		LinkNode node5 = new LinkNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		
		LinkNode kswap = Kswap(node1, 3);
		while(kswap!=null) {
			System.out.print(kswap.val);
			kswap= kswap.next;
		}
	}
}
