import java.util.*;

public class baek_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] arr;
		
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();
			arr = new int[n];
			double sum = 0;
			
			for(int j=0; j<n; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			double avg = sum/n;
			double count = 0;
			
			for(int j=0; j<n; j++) {
				if (arr[j] > avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/n)*100);
		}
		sc.close();
	}
}
