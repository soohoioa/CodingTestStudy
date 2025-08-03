import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] chars = input.toCharArray();

        chars[1] = 'a';

        chars[chars.length - 2] = 'a';

        System.out.println(new String(chars));
    }
}