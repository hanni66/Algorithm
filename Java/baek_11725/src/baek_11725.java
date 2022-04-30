import java.util.*;

public class baek_11725 {
	static List<Integer>[] list;
	static int[] parents;
	static boolean[] visit;
	
	public static void DFS(int v) {	// 깊이 우선 탐색 메소드 
		
		visit[v] = true;		// 방문을 확인할 배열을 true로 만들기
		
		for(int i : list[v]) {		// i를 리스트 v 번째 인덱스까지 반복  
			if(!visit[i]) {			// i를 방문하지 않을때 
				parents[i] = v;		// 배열의 i번째 인덱스에 매개변수 v를 넣음.
				DFS(i);				// 재귀적
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		list = new ArrayList[N+1]; 	// N+1개의 arrayList배열 생성 
		parents = new int[N+1];    	// 부모 노드를 저장할 배열 
		visit = new boolean[N+1];	// 방문을 확인할 boolean타입 배열 생성 
		
		for(int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();    // 입력받은 N의 수만큼 arraylist 생성 
		}
		
		for(int i = 0; i < N-1; i++) {	// 0부터 N-1까지 반복 
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b); 			// 입력받은 a 인덱스에 입력받은 b 넣기.
			list[b].add(a);				// 입력받은 b 인덱스에 입력받은 a 넣기.
		}
		
		DFS(1);							// DFS인 깊이 우선 탐색 진행 
		
		for(int i = 2; i <= N; i++) {	// 부모노드 출력
			System.out.println(parents[i]);
		}
		
		sc.close();
	}
}