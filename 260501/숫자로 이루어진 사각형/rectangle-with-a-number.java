import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(number + " ");

                number++;
                if (number == 10) {
                    number = 1;
                }
            }
            System.out.println();
        }
    }
}