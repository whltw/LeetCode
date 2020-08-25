package tw.bear.leetcode;

public class SelectNNode {
	public static void removeNNode(ListNode headNode,int n) {
//第一种方法：先遍历出链表的长度，然后再删除len-n+1的节点	
//		int len =0;
//		ListNode curNode = headNode;
//		while(curNode!=null) {
//			len++;
//			curNode=curNode.nextNode;
//		}
//		System.out.println("k:"+len);
//		int removeNode= len-n;
//		int i=0;
//		curNode = headNode;
//		while(i!=removeNode) {
//			i++;
//			curNode = curNode.nextNode;
//		}  
//		curNode.nextNode = curNode.nextNode.nextNode;
		
//第二种方法：设置两个指针，第一个指针先走到n个节点，然后第二个节点与第一个节点同时移动，当第一个节点为null即第二个节点为删除节点
		int k=-1;
		ListNode first = headNode;
		ListNode second  = headNode;
		while(first!=null&&k!=n) {
			k++;
			first = first.nextNode;
		}
		while(first!=null) {
			first = first.nextNode;
			second = second.nextNode;
		}
		System.out.println(second.nextNode.val);
		second.nextNode = second.nextNode.nextNode;
	}
	public static void main(String[] args) {
		ListNode node1 =new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node4.nextNode=null;
		node3.nextNode= node4;
		node2.nextNode=node3;
		node1.nextNode = node2;
		removeNNode(node1, 3);
	}
	

}
class ListNode{
	int val;
	public ListNode() {
		// TODO Auto-generated constructor stub
	}
	ListNode nextNode;
	ListNode(int x){
		this.val = x;
	}
}
