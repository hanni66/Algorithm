import java.util.*;

public class baek_1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);   // 이전 dp + 현재 배열값 과 현재 배열값 중 큰 것을 dp에 저장
            max = Math.max(max, dp[i]); // 최댓값 저장
        }

        System.out.println(max);
        sc.close();
    }
}
