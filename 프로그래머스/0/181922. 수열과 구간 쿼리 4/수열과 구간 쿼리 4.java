class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int s = q[0], e = q[1], k = q[2];
            
            for (int i = s; i <= e; i++) {
                if (k != 0 && i % k == 0 || k == 0 && i == 0) {
                    arr[i]++;
                }
            }
        }
        
        return arr;
    }
}