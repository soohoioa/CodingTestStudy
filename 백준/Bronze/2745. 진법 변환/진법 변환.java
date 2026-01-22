import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        long result = 0;

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int digit;

            if ('0' <= c && c <= '9') {
                digit = c - '0';
            } else { 
                digit = c - 'A' + 10;
            }

            result = result * B + digit;
        }

        System.out.println(result);
    }
}
