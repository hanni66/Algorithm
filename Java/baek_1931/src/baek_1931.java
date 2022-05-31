import java.util.*;

public class baek_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int array[][] = new int[N][2];

		for(int i=0; i<N; i++) {			// 입력받기 
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();		
		}

		// b를 기준으로 정렬 
		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}else {
					return o1[1] - o2[1]; 
				}
			}
		});

		int com = 0;	// 비교할 변수 
		int count = 0;	// 횟수를 저장할 변수 

		for(int i=0; i<N; i++) {		// 횟수를 알아낼 반복문 
			if(array[i][0] >= com) {
				com = array[i][1];
				count ++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
