import java.io.*;
import java.util.*;

public class Main {

    static class Person {
        String name;
        int height;
        int weight;

        Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.add(new Person(name, height, weight));
        }

        // 키 기준 오름차순 정렬
        Collections.sort(list, (a, b) -> a.height - b.height);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (Person p : list) {
            sb.append(p.name)
                    .append(" ")
                    .append(p.height)
                    .append(" ")
                    .append(p.weight)
                    .append("\n");
        }

        System.out.print(sb);
    }
}