import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<>(); 

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine()); 
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (set.contains(target)) {
                sb.append("1\n"); 
            } else {
                sb.append("0\n"); 
            }
        }

        System.out.print(sb);
    }
}
