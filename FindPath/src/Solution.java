import java.util.ArrayList;

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;
	}
}

public class Solution {
	ArrayList<ArrayList<Integer>> pathsum = new ArrayList<>();
	ArrayList<Integer> path = new ArrayList<>();
	int expectedSum;
	int currentSum = 0;
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if(root == null)
			return pathsum;
		expectedSum = target;
		findRecur(root);
		return pathsum;
	}
	
	public void findRecur(TreeNode root) {
		currentSum += root.val;
		path.add(root.val);
		boolean isLeaf = (root.left == null && root.right == null);
		if(isLeaf && expectedSum == currentSum) {
			ArrayList<Integer> tmpPath = new ArrayList<>(path);
			pathsum.add(tmpPath);
		}
		if(root.left != null)
			findRecur(root.left);
		if(root.right != null)
			findRecur(root.right);
		path.remove(path.size() - 1);
		currentSum -= root.val;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		TreeNode t5 = new TreeNode(5);
		TreeNode t12 = new TreeNode(12);
		TreeNode t4 = new TreeNode(4);
		TreeNode t7 = new TreeNode(7);
		root.left = t5;
		root.right = t12;
		t5.left = t4;
		t5.right = t7;
		Solution slt = new Solution();
		slt.FindPath(root, 22);
	}
}
