import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String fileName = br.readLine();
            String[] parts = fileName.split("\\.");
            String ext = parts[1];

            map.put(ext, map.getOrDefault(ext, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey())
              .append(" ")
              .append(entry.getValue())
              .append("\n");
        }

        System.out.print(sb);
    }
}