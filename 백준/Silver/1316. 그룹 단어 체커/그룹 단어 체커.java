import java.io.*;

public class Main {

    private static boolean isGroupWord(String s) {
        boolean[] seen = new boolean[26];

        char prev = 0; 
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (cur != prev) {
                int idx = cur - 'a';
                if (seen[idx]) return false;
                seen[idx] = true; 
                prev = cur;
            }
            
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) count++;
        }

        System.out.println(count);
    }
}
