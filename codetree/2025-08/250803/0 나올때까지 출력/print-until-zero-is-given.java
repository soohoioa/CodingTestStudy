import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            numbers.add(n);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}