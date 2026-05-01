import java.util.*;

public class Main {
    public static void number(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNumber = sc.nextInt();
        int colNumber = sc.nextInt();
        number(rowNumber, colNumber);
    }
}