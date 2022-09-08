
import java.io.IOException;
import java.util.Scanner;

public class baek_5639 {
	public static class Node{
		Node left;
		Node right;
		int data;
		public Node(int data) {
			this.data = data;
		}
	}

	public static Node insertNode(Node node, int N) {    // 트리를 구성/만듦
		Node result = null;

		if(node == null) {         // 노드가 비어있을때 
			return new Node(N);    // N이 data가 되는 새로운 노드를 리턴 
		}

		if(node.data > N) {   // 비교할 노드의 data와 입력된 N의 크기를 비교 
			result = insertNode(node.left, N);   // result노드에 N을 기존 노드의 왼쪽에 삽입하는 것을 저장
			node.left = result;					 // result는 node의 왼쪽을 가리킴.
		}else {
			result = insertNode(node.right, N);   // 오른쪽에 삽입 
			node.right = result;				  // 오른쪽으로 가리킴.
		}
		return node;   // 노드를 리턴 
	}

	// 후위 순회 출력
	public static void postOrder(Node node) {
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();       // N입력 받기 
		Node root = new Node(N);    // 입력 받은 N으로 root Node 만들기 

		while(sc.hasNext()) {   // Boolean타입으로 반환. 다음에 가져올 값이 있으면 True, 없으면 False
			try { // 에러가 발생할 수 있는 코드 
				N = sc.nextInt();      // 전위 순회 됨.
				root = insertNode(root, N);    // root 노드에 입력받은 N의 값을 넣기 
			} catch (Exception e) {    // 에러시 수행 
				break;                 // 반복문에서 벗어남
			}

		}
		postOrder(root);    // root를 후위 순회.
		
		sc.close();
	}
}
