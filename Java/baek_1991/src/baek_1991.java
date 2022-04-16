import java.util.Scanner;

public class baek_1991 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BinaryTree bt = new BinaryTree();
		for (int i=0; i<n; i++) {
			bt.addNode(sc.next().charAt(0), sc.next().charAt(0), sc.next().charAt(0));
		}
		
		// 전위 순회 
		bt.preOrder(bt.root);
		System.out.println();
		// 중위 순회 
		bt.inOrder(bt.root);
		System.out.println();
		// 후위 순회 
		bt.postOrder(bt.root);
		System.out.println();
		
		sc.close();
	}
}

class Node {
	char value;
	Node left;
	Node right;
	
	public Node(char value) {
		this.value = value;
		left = null;
		right = null;
	}
}

class BinaryTree {
	Node root;
	
	public void addNode(char data, char left_data, char right_data) {
		if (root == null) {
			if(data != '.') {
				root = new Node(data);
			} 
			if (left_data != '.') {
				root.left = new Node(left_data);
			}
			if (right_data != '.') {
				root.right = new Node(right_data);
			}
		} else {
			searchNode(root, data, left_data, right_data);
		}
	}
	
	public void searchNode(Node root, char data, char left_data, char right_data) {
		if (root == null) {    // 루트 노드가 null이면 종료한다.
			return;
		} else if (root.value == data) {    // 루트 노드의 value값이 data와 같으면 
			if (left_data != '.') {         // left_data가 .이 아니라면 왼쪽 노드에 추가 
				root.left = new Node(left_data);
			}
			if (right_data != '.') {    // right_data가 .이 아니라면 오른쪽 노드에 추가 
				root.right = new Node(right_data);
			}
		} else {  // data를 찾지 못했다면 재귀를 이용해 left와 right를 모두 찾아본다.
			searchNode(root.left, data, left_data, right_data);
			searchNode(root.right, data, left_data, right_data);
		}
	}
	
	public void preOrder(Node root) {    // 전위 순회 
		System.out.print(root.value);    // 출력 
		if(root.left != null) { preOrder(root.left); }
		if (root.right != null) { preOrder(root.right); }
	}
	
	public void inOrder(Node root) {     // 중위 순회
		if(root.left != null) { inOrder(root.left); } 
		System.out.print(root.value);    // 출력 
		if (root.right != null) { inOrder(root.right); }
	}
	
	public void postOrder(Node root) {   // 후위 순회 
		if(root.left != null) { postOrder(root.left); } 
		if (root.right != null) { postOrder(root.right); }
		System.out.print(root.value);    // 출력 
	}
}
