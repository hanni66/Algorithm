import java.util.*;

public class baek_2178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int num[][] = new int[N][M];
		
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<M; j++) {
//				num[i][j] += sc.nextInt();
//			}
//		}
		int root = 0;
		while(root<N) {
			for(int i=0; i<M; i++) {
				num[root][i] = sc.nextInt();
			}
			root++;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.println(num[i][j]);
			}
		}
		
		sc.close();
	}
}
