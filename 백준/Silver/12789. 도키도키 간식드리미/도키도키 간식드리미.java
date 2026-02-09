import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int target = 1;

        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());

            if (cur == target) {
                target++;
            } else {
                stack.push(cur);
            }

            while (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                target++;
            }
        }

        if (target == N + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
