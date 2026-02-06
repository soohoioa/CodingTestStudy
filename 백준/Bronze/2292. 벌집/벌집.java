import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long max = 1;   // 현재 층에서의 마지막 번호
        int layer = 1;  // 층(정답)

        while (N > max) {
            max += 6L * layer;
            layer++;
        }

        System.out.println(layer);
    }
}
