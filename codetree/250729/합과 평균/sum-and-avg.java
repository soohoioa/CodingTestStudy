import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A + B;
        double avg = sum / 2.0;

        System.out.printf("%d %.1f\n", sum, avg);
    }
}