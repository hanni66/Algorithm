
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class baek_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] word = new String [N];
		
		sc.nextLine();    // 줄바꿈 제거 
		
		for(int i=0; i<N; i++) {
			word[i] = sc.nextLine();
		}
		
		Arrays.sort(word, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(word[0]);
		
		for (int i=1; i<N; i++) {
			if(!word[i].equals(word[i-1])) {
				System.out.println(word[i]);
			}
		}
		
		sc.close();
	}

}
