
import java.util.*;

public class baek_10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int n= sc.nextInt();
		
		String array[][] = new String[n][2]; // 나이, 이름
		
		for(int i=0;i<n;i++) {              // 입력 받은 수만큼 반복 
			for(int j=0;j<2;j++) {
				array[i][j] = sc.next();		// 입력받기 
			}
		}

		Arrays.sort(array,new Comparator<String[]>() { // 0은 나이, 1은 이름으로 정렬하기 

			@Override
			public int compare(String[] s1,String[] s2) {    // 문자열을 비교 							
					return Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));   // int형으로 비교함.
			}		
		});
		
		for(int i=0;i<n;i++) {
				System.out.println(array[i][0]+" "+array[i][1]);
		}
		sc.close();
	}
}