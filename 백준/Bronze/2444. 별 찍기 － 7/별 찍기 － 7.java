import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int s = 0; s < N - i; s++) sb.append(" ");
            for (int star = 0; star < 2 * i - 1; star++) sb.append("*");
            sb.append("\n");
        }

        for (int i = 1; i <= N - 1; i++) {
            for (int s = 0; s < i; s++) sb.append(" ");
            for (int star = 0; star < 2 * (N - i) - 1; star++) sb.append("*");
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
