package baek_2750;

import java.util.*;

public class baek_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
