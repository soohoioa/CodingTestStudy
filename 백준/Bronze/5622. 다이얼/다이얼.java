import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c <= 'C') total += 3;          // ABC
            else if (c <= 'F') total += 4;     // DEF
            else if (c <= 'I') total += 5;     // GHI
            else if (c <= 'L') total += 6;     // JKL
            else if (c <= 'O') total += 7;     // MNO
            else if (c <= 'S') total += 8;     // PQRS
            else if (c <= 'V') total += 9;     // TUV
            else total += 10;                  // WXYZ
        }

        System.out.println(total);
    }
}
