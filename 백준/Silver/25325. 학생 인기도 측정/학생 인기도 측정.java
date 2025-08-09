import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        String[] names = br.readLine().trim().split("\\s+");

        Map<String, Integer> cnt = new HashMap<>();
        for (String name : names) cnt.put(name, 0);

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) continue;
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String who = st.nextToken();
                cnt.put(who, cnt.get(who) + 1);
            }
        }

        List<String> order = new ArrayList<>(Arrays.asList(names));
        order.sort((a, b) -> {
            int ca = cnt.get(a), cb = cnt.get(b);
            if (ca != cb) return Integer.compare(cb, ca); 
            return a.compareTo(b);                    
        });

        StringBuilder sb = new StringBuilder();
        for (String name : order) {
            sb.append(name).append(' ').append(cnt.get(name)).append('\n');
        }
        System.out.print(sb);
    }
}
