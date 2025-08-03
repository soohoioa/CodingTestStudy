import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chars = new String[10];

        for (int i = 0; i < 10; i++) {
            chars[i] = sc.next();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}