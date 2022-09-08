import java.util.*;

public class baek_11000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int array[][] = new int[N][2];

		for(int i=0; i<N; i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}

		// array[][0]을 기준으로 정렬 
		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0]; 
				}
			}
		});
		
		// 강의실의 갯수를 count 하기 위한 우선순위 Queue
		// 우선순위 큐란 저장한 순서에 관계없이 우선순위가 높은 것부터 꺼낸다.
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
        for (int i = 0; i < N; i++) {
            int start = array[i][0];	// 시작 시간 
            int end = array[i][1];		// 끝나는 시간 
            
            // 큐가 비어있지 않거나 큐의 원소가 시작시간보다 작거나 같으면
            if (!q.isEmpty() && q.peek() <= start) {
                q.poll();	// 큐를 비운다.
            }
            
            q.offer(end);		// 끝나는 시간을 큐에 넣는다.
        }
        System.out.println(q.size());
		sc.close();
	}
}
