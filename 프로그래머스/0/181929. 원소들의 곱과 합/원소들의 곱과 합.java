class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum = 0;
        
        for (int num : num_list) {
            answer *= num;
            sum += num;
        }
        return answer < sum * sum ? 1 : 0;
    }
}