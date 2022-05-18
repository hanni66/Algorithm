import java.util.Scanner;

public class baek_9252 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		int m = s1.length();
		int n = s2.length();
		int[][] C = new int[m+1][n+1];
		// 길이 구하기 
		for(int i=0; i<m; i++) {
			C[i][0] = 0;
		}
		for(int j=0; j<n; j++) {
			C[0][j] = 0;
		}
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					C[i][j] = C[i-1][j-1]+1;
				} else {
					C[i][j] = Math.max(C[i-1][j], C[i][j-1]);
				}
			}
		}
		System.out.println(C[m][n]);
		// 경로 저장 
		int i = m;
		int j = n;
		String lsc = "";
		String answer = "";
		while(i != 0 && j != 0) {
			if(C[i][j] == C[i-1][j])
				i--;
			else if(C[i][j] == C[i][j-1])
				j--;
			else {
				lsc += s1.charAt(i-1);
				i--;
				j--;
			}
		}
		// 문자열 뒤집기
		for(int k=lsc.length()-1; k>=0; k--) {
			answer += lsc.charAt(k);
		}
		System.out.println(answer);
		sc.close();
	}
}
