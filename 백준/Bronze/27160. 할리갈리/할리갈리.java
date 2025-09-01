import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        Map<String, Integer> cnt = new HashMap<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            cnt.put(fruit, cnt.getOrDefault(fruit, 0) + num);
        }

        boolean ok = false;
        for (int v : cnt.values()) {
            if (v == 5) { ok = true; break; }
        }

        System.out.println(ok ? "YES" : "NO");
    }
}
