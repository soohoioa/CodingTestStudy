import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int line = 1;
        int sum = 1; 

        while (sum < X) {
            line++;
            sum += line;
        }

        int prev = sum - line;
        int pos = X - prev; 

        int numerator, denominator;

        if (line % 2 == 1) {
            numerator = line - pos + 1;
            denominator = pos;
        } else { 
            numerator = pos;
            denominator = line - pos + 1;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
