import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        long bestValue = arr[0];
        int bestCount = 1;

        long curValue = arr[0];
        int curCount = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i] == curValue) {
                curCount++;
            } else {
                // 구간 종료 -> 최댓값 갱신
                if (curCount > bestCount) {
                    bestCount = curCount;
                    bestValue = curValue;
                }
                // 다음 구간 시작
                curValue = arr[i];
                curCount = 1;
            }
        }

        // 마지막 구간 처리
        if (curCount > bestCount) {
            bestCount = curCount;
            bestValue = curValue;
        }

        System.out.println(bestValue);
    }
}
