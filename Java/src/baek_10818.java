/*
백준 10818

문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다. 
*/
package baek_10818;

import java.util.Scanner;
//import java.util.Arrays;
public class baek_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int array[] = new int[N];
		
		for(int i=0;i<N; i++) {
			array[i] = sc.nextInt();
		}
		
//		Arrays.sort(array);
//		System.out.print(array[0] + " " + array[N-1]);
		
		int min = array[0];
		int max = array[0];
		
		for(int j=0; j<array.length; j++) {
			if(min > array[j]) {
				min = array[j];
			}
			if(max < array[j]) {
				max = array[j];
			}
		}
		System.out.print(min + " " + max);
		
		sc.close();
	}
}
