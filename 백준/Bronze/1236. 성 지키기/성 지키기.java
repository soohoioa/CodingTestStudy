import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열

        boolean[] rowGuard = new boolean[N];
        boolean[] colGuard = new boolean[M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'X') {
                    rowGuard[i] = true;
                    colGuard[j] = true;
                }
            }
        }

        int emptyRows = 0;
        for (int i = 0; i < N; i++) {
            if (!rowGuard[i]) emptyRows++;
        }

        int emptyCols = 0;
        for (int j = 0; j < M; j++) {
            if (!colGuard[j]) emptyCols++;
        }

        System.out.println(Math.max(emptyRows, emptyCols));
    }
}
