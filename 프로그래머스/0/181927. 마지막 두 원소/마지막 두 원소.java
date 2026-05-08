import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        
        int last = num_list[n - 1];
        int prev = num_list[n - 2];
        
        int newValue;
        if (last > prev) {
            newValue = last - prev;
        } else {
            newValue = last * 2;
        }
        
        int[] answer = Arrays.copyOf(num_list, n + 1);
        answer[n] = newValue;
        
        return answer;
    }
}