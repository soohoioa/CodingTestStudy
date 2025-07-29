import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int x = (A < B ? 1 : 0);
        int y = (A == B ? 1 : 0);

        System.out.println(x + " " + y);

    }
}