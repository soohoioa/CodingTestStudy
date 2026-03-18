import java.io.*;
import java.util.*;

public class Main {

    static class Student {
        String name;
        int total;

        Student(String name, int a, int b, int c) {
            this.name = name;
            this.total = a + b + c; // 🔥 총점 계산
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            list.add(new Student(name, a, b, c));
        }

        // 🔥 총점 기준 오름차순 정렬
        Collections.sort(list, (a, b) -> a.total - b.total);

        StringBuilder sb = new StringBuilder();
        for (Student s : list) {
            sb.append(s.name).append("\n");
        }

        System.out.print(sb);
    }
}