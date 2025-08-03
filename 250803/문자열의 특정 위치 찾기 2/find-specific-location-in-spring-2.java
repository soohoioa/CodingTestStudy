import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = {"apple", "banana", "grape", "blueberry", "orange"};

        char ch = sc.next().charAt(0);

        int count = 0;

        for (String word : words) {
            boolean match = false;
            if (word.length() >= 3 && word.charAt(2) == ch) {
                match = true;
            }
            if (word.length() >= 4 && word.charAt(3) == ch) {
                match = true;
            }

            if (match) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println(count);
    }
}