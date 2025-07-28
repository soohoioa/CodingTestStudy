import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); 
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> line = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int pick = Integer.parseInt(st.nextToken());
            int studentNumber = i + 1;

            line.add(line.size() - pick, studentNumber);
        }

        for (int num : line) {
            System.out.print(num + " ");
        }
    }
}
