import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum1 = korean[i] + english[i] + math[i];
                int sum2 = korean[j] + english[j] + math[j];

                if (sum1 > sum2) {
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;

                    int temp = korean[i];
                    korean[i] = korean[j];
                    korean[j] = temp;

                    temp = english[i];
                    english[i] = english[j];
                    english[j] = temp;

                    temp = math[i];
                    math[i] = math[j];
                    math[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " " + korean[i] + " " + english[i] + " " + math[i]);
        }
    }
}