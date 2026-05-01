import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int numberN = Math.abs(n);
        int numberM = Math.abs(m);

        int x = numberN;
        int y = numberM;

        while ( y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;

        int lcm  = (numberN * numberM) / gcd;

        System.out.println(lcm);
    }
}