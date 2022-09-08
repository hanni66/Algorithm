import java.util.*;

public class baek_5054 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 케이스의 개수  
		int result[] = new int[t]; // 최소값을 저장할 배열 
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt(); // 방문할 상점의 수 
			int array[] = new int[n]; // 상점의 위치 저장할 배열
			
			for(int j=0; j<n; j++) {
				array[j] = sc.nextInt(); // 상점의 위치
			}
			Arrays.sort(array);  // 상점의 위치 정렬 
			
			for(int a=1; a<n; a++) {     // hashmap에 거리만큼의 값을 저장 
				map.put(a, array[a-1] - array[a]); // 0번째 인덱스에서 1번째 인덱스 빼기 
			}
			
			int sum = 0;
			
			for(int b=1; b<n; b++) {        // sum에 각각의 거리를 저장
				sum += map.get(b);
			}
			
			result[i] = Math.abs(sum*2);    // 절대값으로 만들기 
			
		}
		
		for(int i=0; i<t; i++) {            // 출력문
			System.out.println(result[i]);
		}
		
		sc.close();
	}
}