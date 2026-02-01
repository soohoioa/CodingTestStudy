import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            int q = C / 25;
            C %= 25;

            int d = C / 10;
            C %= 10;

            int n = C / 5;
            C %= 5;

            int p = C;

            sb.append(q).append(" ")
              .append(d).append(" ")
              .append(n).append(" ")
              .append(p).append('\n');
        }

        System.out.print(sb);
    }
}
