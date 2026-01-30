import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int side = (1 << n) + 1;
        int result = side * side;

        System.out.println(result);
    }
}
