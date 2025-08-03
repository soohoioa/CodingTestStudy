import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sequence = new int[10];

        sequence[0] = sc.nextInt();
        sequence[1] = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            int sum = sequence[i - 2] + sequence[i - 1];
            sequence[i] = sum % 10; 
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}