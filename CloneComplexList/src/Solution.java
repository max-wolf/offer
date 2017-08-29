import java.util.HashMap;
import java.util.Map;

class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;
	
	RandomListNode(int label) {
		this.label = label;
	}
}

public class Solution {
	public RandomListNode Clone(RandomListNode pHead) {
		if(pHead == null)
			return null;
		RandomListNode pNode = pHead;
		RandomListNode pCloneHead = new RandomListNode(pNode.label);
		pNode = pNode.next;
		RandomListNode pCloneNode = pCloneHead;
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		map.put(pHead, pCloneHead);
		while(pNode != null) {
			RandomListNode pCloneNext = new RandomListNode(pNode.label);
			pCloneNode.next = pCloneNext;
			pCloneNode = pCloneNext;
			map.put(pNode, pCloneNode);
			pNode = pNode.next;
		}
		pNode = pHead;
		pCloneNode = pCloneHead;
		while(pNode != null) {
			RandomListNode pRandom = pNode.random;
			if(pRandom != null)
				pCloneNode.random = map.get(pRandom);
			pNode = pNode.next;
			pCloneNode = pCloneNode.next;
		}
		return pCloneHead;
	}
}
