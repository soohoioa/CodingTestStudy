import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            count[b.charAt(i) - 'a']--;
        }

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            answer += Math.abs(count[i]);
        }

        System.out.println(answer);
    }
}