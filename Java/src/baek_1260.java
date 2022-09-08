package baek_1260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
  
public class baek_1260 {
    // 함수에서 사용할 변수들
    static int[][] graph;     //간선 간의 위치를 저장할 2차원 배열 
    static boolean visited[]; //방문 했음을 체크 
    static int N;			  //정점개수
    static int M;			  //간선개수
          
    public static void dfs(int start){
        visited[start] = true;      // 방문 했음을 체크 
        System.out.print(start + " ");
        
        for(int i=1; i<=N; i++){ //정점개수만큼 반복
            if(graph[start][i] == 1 && visited[i] == false){
                dfs(i);
            }
        }
    }
      
    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<Integer>();    // 탐색 순서를 담을 큐 
        q.add(start);
        visited[start] = true;
        
        while(!q.isEmpty()){    // 큐가 빌 때까지 반복 -> 탐색이 끝나야 종료
            int temp = q.poll();    // 큐에 들을 정점을 순서대로 하나씩 추출 
            
            // 선입 선출
            System.out.print(temp + " ");
            
            for(int i=1; i<=N; i++){ //정점개수+1 만큼 반복
                if(graph[temp][i] == 1 && visited[i] == false){    // 현재 포커스와 인접한 정점들을 탐색 순서에 넣기 
                    q.add(i);
                    visited[i]=true;
                }
            }                       
        }
    }
      
    public static void main(String[] args) {
                  
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();  // 정점 개수 입력받기
        M = sc.nextInt();  // 간선 개수 입력받기 
        int V = sc.nextInt();  // 시작 정점 입력받기 
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];
          
        for(int i=1; i<=M; i++){  // 간선의 개수 만큼 반복 
            int a = sc.nextInt();
            int b = sc.nextInt();
              
            graph[a][b] = graph[b][a] = 1;    // 간선 양방향

        }
          
        dfs(V);
          
        for(int j=1; j<=N; j++){
        	visited[j]=false;
        }
        System.out.println();
          
        bfs(V);
        
        sc.close();
    }
}
