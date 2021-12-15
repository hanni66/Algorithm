package baek_4153;

import java.util.Scanner;
import java.util.ArrayList;

public class baek_4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		ArrayList<String> list = new ArrayList<String>();


		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		if(a>0&&b>0&&c>0) {
			if(a>=c && a>=b) {
				if(a*a == b*b + c*c) {
					list.add("right");
				}
				else {
					list.add("wrong");
				}
			}
			else if(b>=a && b>=c) {
				if(b*b == a*a + c*c) {
					list.add("right");
				}
				else {
					list.add("wrong");
				}
			}
			else {
				if(c*c == a*a + b*b) {
					list.add("right");
				}
				else {
					list.add("wrong");
				}
			}
			continue;
		}
		else {
			break;
		}
		}
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}
}
