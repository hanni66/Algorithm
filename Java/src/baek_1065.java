import java.util.*;

public class baek_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(counting(sc.nextInt()));
		
		sc.close();
	}
	
	public static int counting(int num) {
		int count = 0;
		
		if (num < 100) {
			return num;
		} else {
			count = 99;
			
			for(int i=100; i<=num; i++) {
				int h = i/100;			// 100의 자리
				int t = (i/10)%10;		// 10의 자리
				int o = i%10;			// 1의 자리
				
				if ((h-t) == (t-o)) {
					count++;
				}
			}
		}
		
		return count;
	}
}
