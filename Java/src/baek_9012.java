/*
문제: 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 
그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 
한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 
만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 
그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 
예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 
여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.  
*/

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

class Stack {
	public class Node {
		private String data;
	    private Node nextNode;
	    
	    public Node(String data) {
	        this.data = data;
	        this.nextNode = null;
	    }
	}
	
	private Node top;
	
    public Stack() {
    	this.top = null;
	}
    
	public boolean isEmpty() {
		return top == null;    // 스택이 비어있으면 true 반환 
	}
	
	public String push(String data) { 
		Node node = new Node(data);  // 노드 생성
		node.nextNode = top;         // 새로운 노드.next에 top으로 지정 (삽입 과정)
		
		top = node;                  // 생성한 node를 top에 지정
		
		return data;                 // 추가한 data를 리턴 
	}
	
	public void pop() {
		if (isEmpty()) {                    // 가장 상단의 top이 null일 때 
			throw new EmptyStackException();  // 예외 처리 
		}
		else {
			top = top.nextNode;      // top에 top.nextNode을 지정 (삭제)
		}
	}
}

public class baek_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int t = sc.nextInt();    // 테스트 데이터 입력받기 
		
		for (int i=0; i<t; i++) {
			Stack stack = new Stack();
			String line = sc.next();  // 괄호 입력받기 
			boolean empty = true;
			
			for (int j=0; j<line.length(); j++) { // 괄호의 길이만큼 반복 
				char a = line.charAt(j);          // String으로 받은 line을 한글자씩 보기 
				if (a == '(') {                   // 입력받은 괄호가 '('와 같으면 
					stack.push(")");              // 스택에 )를 넣음 
				}
				else {                            // 입력받은 괄호가 ')'일 때
					if(stack.isEmpty()) {         // 스택이 비어있다면
						empty = false;            // empty는 false를 반환 
						break;
					}
					stack.pop();                  // 스택 삭제  
				}
				
			}
			if (empty && stack.isEmpty()) {       // empty가 true이고, 스택이 비어있으면 리스트에 yes 저장 
				list.add("YES");
			} 
			else {
				list.add("NO");
			}
		}
		
		int total = list.size();  // 리스트의 크기 저장 
		
		for (int k=0; k < total; k++) {        // \n으로 출력하기 위해 
		    System.out.println(list.get(k));
		}	
		sc.close();
	}
}
