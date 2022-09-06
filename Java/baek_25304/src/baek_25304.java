import java.util.*;

public class baek_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<N*2; i++) {
			int a= sc.nextInt();
			int b = sc.nextInt();
			sum += a*b;
			i++;
		}
		
		if (X == sum) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
		
		sc.close();
	}

}
