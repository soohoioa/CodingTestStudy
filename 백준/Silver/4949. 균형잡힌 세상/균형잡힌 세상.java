import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean valid = true;

            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        valid = false;
                        break;
                    }
                    stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        valid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) valid = false;

            sb.append(valid ? "yes" : "no").append('\n');
        }

        System.out.print(sb);
    }
}
