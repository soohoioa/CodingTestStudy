import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int book = 3000;
        int mask = 1000;

        if (N >= book) {
            System.out.println("book");
        } else if (N >= mask) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}