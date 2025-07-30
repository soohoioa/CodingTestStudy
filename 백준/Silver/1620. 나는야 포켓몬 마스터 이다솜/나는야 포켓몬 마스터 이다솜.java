import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameToNum = new HashMap<>();
        String[] numToName = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToNum.put(name, i);
            numToName[i] = name;
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();

            if (isNumber(input)) {
                int idx = Integer.parseInt(input);
                bw.write(numToName[idx] + "\n");
            } else {
                bw.write(nameToNum.get(input) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isNumber(String str) {
        return Character.isDigit(str.charAt(0));
    }
}
