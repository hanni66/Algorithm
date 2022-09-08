import java.util.Scanner;
import java.util.Arrays;

public class baek_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 약수의 개수 입력받기 
		int arr[] = new int[n];	// 약수를 넣을 배열 만들기 
		
		for(int i=0; i<n; i++) {	// 입력받은 약수를 배열에 넣는 과정 
			int num = sc.nextInt();	// 약수 입력받기 
			arr[i] += num; 			// 입력 받은 약수 배열에 넣기 
		}
		
		Arrays.sort(arr);			// 배열을 정렬하기 

		int N = arr[0] * arr[n-1];	// 배열의 첫번째 원소와 n-1번째 원소를 곱한 것이 N이 됨.

		System.out.println(N);		// 출력문 
		
		sc.close();
	}
}
