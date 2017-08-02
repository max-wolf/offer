class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class Solution {
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k <= 0)
			return null;
		ListNode pAhead = head;
		ListNode pBehind = head;
		for(int i = 0; i < k-1; i++) {
			if(pAhead.next != null)
				pAhead = pAhead.next;
			else
				return null;
		}
		while(pAhead.next != null) {
			pAhead = pAhead.next;
			pBehind = pBehind.next;
		}
		return pBehind;
	}
}
