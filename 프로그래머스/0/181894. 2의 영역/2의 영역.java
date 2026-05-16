import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }

        if (start == -1) {
            return new int[] {
                    -1
            };
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }

        int[] answer = new int[end - start + 1];

        int index = 0;

        for (int i = start; i <= end; i++) {
            answer[index++] = arr[i];
        }

        return answer;
    }
}