package tw.bear.niuke;

import java.util.ArrayList;
import java.util.Stack;

public class ListNodeReverseOutPut {
	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<Integer>();
		while(listNode!=null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(stack.size()>0) {
			list.add(stack.pop());
		}
		return list;
	   }
	 
	 public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		ListNodeReverseOutPut listNodeReverseOutPut = new ListNodeReverseOutPut();
		ArrayList<Integer> printListFromTailToHead = listNodeReverseOutPut.printListFromTailToHead(node1);
		for(Integer a:printListFromTailToHead) {
			System.out.println(a);
		}
	}
}

class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
   }
