import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            switch (cmd) {
                case 1: { 
                    int x = Integer.parseInt(st.nextToken());
                    dq.addFirst(x);
                    break;
                }
                case 2: { 
                    int x = Integer.parseInt(st.nextToken());
                    dq.addLast(x);
                    break;
                }
                case 3: { 
                    sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append('\n');
                    break;
                }
                case 4: { 
                    sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append('\n');
                    break;
                }
                case 5: {
                    sb.append(dq.size()).append('\n');
                    break;
                }
                case 6: { 
                    sb.append(dq.isEmpty() ? 1 : 0).append('\n');
                    break;
                }
                case 7: {
                    sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append('\n');
                    break;
                }
                case 8: { 
                    sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n');
                    break;
                }
            }
        }

        System.out.print(sb.toString());
    }
}
