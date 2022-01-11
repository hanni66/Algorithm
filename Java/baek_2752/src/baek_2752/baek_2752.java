package baek_2752;
import java.util.Scanner;

public class baek_2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3개의 수 입력받기 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 3개의 수 비교하기 
		if((a>b) && (a>c)) {    // and 연산자인 && 사용 
			if(b>c) {
				System.out.println(c + " " + b + " " + a);
			} else {
				System.out.println(b + " " + c + " " + a);
			}
		} else if ((b>a) && (b>c)) {
			if(a>c) {
				System.out.println(c + " " + a + " " + b);
			} else {
				System.out.println(a + " " + c + " " + b);
			}
		} else if ((c>a) && (c>b)) {
			if(a>b) {
				System.out.println(b + " " + a + " " + c);
			} else {
				System.out.println(a + " " + b + " " + c);
			}
		}
		sc.close();
	}
}
