import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        int count = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();

                if (arr[i][j] % 5 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}