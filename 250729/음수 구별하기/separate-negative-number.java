import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 0) {
            System.out.println(N);
            System.out.println("minus");
        } else {
            System.out.println(N);
        }
    }
}