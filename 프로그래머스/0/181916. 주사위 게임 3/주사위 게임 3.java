import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7];

        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;

        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        int three = 0;
        int four = 0;

        for (int i = 1; i <= 6; i++) {
            if (count[i] == 1) one.add(i);
            else if (count[i] == 2) two.add(i);
            else if (count[i] == 3) three = i;
            else if (count[i] == 4) four = i;
        }

        if (four != 0) {
            return 1111 * four;
        }

        if (three != 0) {
            int q = one.get(0);
            int value = 10 * three + q;
            return value * value;
        }

        if (two.size() == 2) {
            int p = two.get(0);
            int q = two.get(1);
            return (p + q) * Math.abs(p - q);
        }

        if (two.size() == 1) {
            return one.get(0) * one.get(1);
        }

        return one.get(0);
    }
}