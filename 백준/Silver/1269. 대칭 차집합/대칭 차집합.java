import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>(nA * 2);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nA; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        int inter = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nB; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (setA.contains(x)) inter++;
        }

        int ans = nA + nB - 2 * inter;
        System.out.println(ans);
    }
}
