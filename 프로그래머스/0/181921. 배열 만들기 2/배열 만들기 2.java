import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int bit = 1; bit < 64; bit++) {
            String binary = Integer.toBinaryString(bit);
            String number = binary.replace('1', '5')
                                  .replace('0', '0');

            int num = Integer.parseInt(number);

            if (num >= l && num <= r) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}