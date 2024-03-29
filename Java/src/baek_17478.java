
import java.util.*;

public class baek_17478 {
	static int n;

	//재귀 함수
	static void back(int i)
	{
		String str = "____";

		System.out.print(str.repeat(i));
		System.out.println("\"재귀함수가 뭔가요?\"");

		if (i == n) {
			System.out.print(str.repeat(i));
			System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\" ");
			System.out.print(str.repeat(i));
			System.out.println("라고 답변하였지.");
			return;
		}

		System.out.print(str.repeat(i));
		System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
		System.out.print(str.repeat(i));
		System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
		System.out.print(str.repeat(i));
		System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

		back(i+1);
		System.out.print(str.repeat(i));
		System.out.println("라고 답변하였지.");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // i 입력받기

		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		back(0);
		
		sc.close();
	}
}
