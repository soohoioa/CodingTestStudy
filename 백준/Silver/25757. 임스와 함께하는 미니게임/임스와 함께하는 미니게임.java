import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        char type = st.nextToken().charAt(0);

        Set<String> players = new HashSet<>();
        for (int i = 0; i < n; i++) {
            players.add(br.readLine().trim());
        }

        int needOthers; 
        if (type == 'Y') needOthers = 1; 
        else if (type == 'F') needOthers = 2;
        else needOthers = 3;

        System.out.println(players.size() / needOthers);
    }
}
