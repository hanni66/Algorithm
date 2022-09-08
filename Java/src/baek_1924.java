import java.io.*;
import java.util.*;

class baek_1924 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] d = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int c = 0;

        for(int i=0; i<x; i++) // 월만큼 다 더하기
            c += m[i];

        c += y;// 일수 더하기

        System.out.println(d[c%7]);
    }
}
