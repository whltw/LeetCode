package tw.bear.leetcode;

public class LinkNodeCombine {
	
	public  static LinkNode mergeNode(LinkNode l1,LinkNode l2) {
		LinkNode l3 = new LinkNode();
		LinkNode l4 =l3;
		while(l1!=null && l2!=null) {
			if(l1.val>l2.val) {
				LinkNode l5 = new LinkNode(l2.val);
				l4.next = l5;
				l4 = l4.next;
				l2=l2.next;
			}
			else {
				LinkNode l5 = new LinkNode(l1.val);
				l4.next = l5;
				l4 = l4.next;
				l1 = l1.next;
			}
			
			
		}
		if(l1!=null) {
			while(l1!=null){
				LinkNode l5 = new LinkNode(l1.val);
				l4.next = l5;
				l4 = l4.next;
				l1 = l1.next;
			}
		}
		if(l2!=null) {
			while(l2!=null){
				LinkNode l5 = new LinkNode(l2.val);
				l4.next = l5;
				l4 = l4.next;
				l2 = l2.next;
			}
		}
		
		return l3.next;	
	}
	public static void main(String[] args) {
		LinkNode linkNode1 = new LinkNode(1);
		LinkNode linkNode2 = new LinkNode(2);
		LinkNode linkNode3 = new LinkNode(3);
		LinkNode linkNode4 = new LinkNode(4);
		LinkNode linkNode5 = new LinkNode(5);
		LinkNode linkNode6 = new LinkNode(6);
		linkNode1.next = linkNode3;
		linkNode3.next = linkNode5;
		linkNode5.next = null;
		linkNode2.next = linkNode4;
		linkNode4.next = linkNode6;
		linkNode6.next = null;
		if(linkNode6!=null)
			System.out.println(linkNode6.val);
		LinkNode mergeNode = mergeNode(linkNode1, linkNode2);
		while(mergeNode!=null) {
			System.out.print(mergeNode.val+"\t");
			mergeNode = mergeNode.next;	
		}
		
	}
}

class LinkNode{
	int val;
	LinkNode next;
	LinkNode(){}
	LinkNode(int x){
			val = x;
	}
}
