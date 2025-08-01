import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 

        int myVote = Integer.parseInt(br.readLine()); 
        PriorityQueue<Integer> others = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i < N; i++) {
            others.add(Integer.parseInt(br.readLine()));
        }

        int bribeCount = 0;

        while (!others.isEmpty()) {
            int top = others.peek(); 

            if (myVote > top) break; 

            others.poll();
            others.add(top - 1); 
            myVote++;
            bribeCount++;
        }

        System.out.println(bribeCount);
    }
}
