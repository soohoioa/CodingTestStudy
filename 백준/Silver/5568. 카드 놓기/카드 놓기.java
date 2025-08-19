import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static String[] card;
    static boolean[] used;
    static HashSet<String> seen = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());
        K = Integer.parseInt(br.readLine().trim());

        card = new String[N];
        for (int i = 0; i < N; i++) card[i] = br.readLine().trim();

        used = new boolean[N];
        dfs(0, new StringBuilder());

        System.out.println(seen.size());
    }

    static void dfs(int depth, StringBuilder sb) {
        if (depth == K) {
            seen.add(sb.toString());
            return;
        }
        for (int i = 0; i < N; i++) {
            if (used[i]) continue;
            used[i] = true;

            int lenBefore = sb.length();
            sb.append(card[i]);
            dfs(depth + 1, sb);
            sb.setLength(lenBefore);

            used[i] = false;
        }
    }
}
