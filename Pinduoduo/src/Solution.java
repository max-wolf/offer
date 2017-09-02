import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] input = new String[n][2];
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			int val = sc.nextInt();
			input[i][0] = s;
			input[i][1] = String.valueOf(val);
		}
		
		Node root = new Node();
		addTree(n, input, root);
		
		System.out.println(root.name);
		LinkedList<Node> list = new LinkedList<>();
		for(Node tmp : root.child) {
			list.push(tmp);
		}
		int blank = 0;
		while(!list.isEmpty()) {
			Node node = list.pop();
			for(int i = 0; i < blank; i++)
				System.out.print(" ");
			if(list.isEmpty()) 
				blank++;
			System.out.print("|-- ");
			System.out.println(node.name);
			for(Node tmp : node.child) {
				list.push(tmp);
			}
		}
	}
	
	public static void addTree(int n, String[][] input, Node root) {
		//Node root = new Node();
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(input[i][1]) == -1) {
				root.name = input[i][0];
				root.val = i;
				break;
			}
		}
		addNode(n, input, root);
		
	}
	
	public static void addNode(int n, String[][] input, Node node) {
		if(!hasChild(n, input, node))
			return;
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(input[i][1]) == node.val) {
				Node tmp = new Node(input[i][0], i);
				node.child.add(tmp);
				addNode(n, input, tmp);
			}
		}
		Collections.sort(node.child, new Comparator<Node>() {
			public int compare(Node a, Node b) {
				return -a.name.compareTo(b.name);
			}
		});
	}

	public static boolean hasChild(int n, String[][] input, Node node) {
		boolean res = false;
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(input[i][1]) == node.val)
				res = true;
		}
		return res;
	}
}

class Node {
	String name;
	int val;
	List<Node> child = new ArrayList<>();
	
	public Node(String name, int val) {
		this.name = name;
		this.val = val;
	}
	
	public Node() {
		
	}
}

/*
my-app -1
src 0
main 1
java 2
resources 2
webapp 2
test 1
java 6
resources 6
pom.xml 0
*/
