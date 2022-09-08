import java.util.*;

public class baek_9076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int[][] arr = new int[t][5];

		for (int i=0; i<t; i++) {
			for (int j=0; j<5; j++) {
				int n = sc.nextInt();
				arr[i][j] += n; 
			}
		}

		for(int i=0; i<t; i++) {
			Arrays.sort(arr[i]);
		}

		for(int i=0; i<t;i++) {
			if((arr[i][3] - arr[i][1]) >= 4) {
				System.out.println("KIN");
			} else {
				System.out.println(arr[i][1]+arr[i][2]+arr[i][3]);
			}
		}
		sc.close();
	}
}