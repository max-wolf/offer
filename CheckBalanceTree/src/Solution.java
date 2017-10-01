
public class Solution {
	public boolean IsBalanced_Solution(TreeNode root) {
		if(TreeDepth(root) == -1)
			return false;
		else 
			return true;
	}
	
	public static int TreeDepth(TreeNode root) {
		if(root == null)
			return 0;
		int left = TreeDepth(root.left);
		if(left == -1)
			return -1;
		int right = TreeDepth(root.right);
		if(right == -1)
			return -1;
		if(Math.abs(left-right)>1)
			return -1;
		else {
			int tmp = Math.max(left, right);
			return tmp+1;
		}
	}
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}