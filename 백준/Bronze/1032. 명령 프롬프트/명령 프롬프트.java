import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        String[] files = new String[N];

        for (int i = 0; i < N; i++) {
            files[i] = br.readLine();
        }

        int length = files[0].length(); 
        StringBuilder pattern = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char firstChar = files[0].charAt(i); 
            boolean same = true;

            for (int j = 1; j < N; j++) {
                if (files[j].charAt(i) != firstChar) {
                    same = false;
                    break;
                }
            }

            if (same) {
                pattern.append(firstChar);
            } else {
                pattern.append('?');
            }
        }

        System.out.println(pattern);
    }
}
