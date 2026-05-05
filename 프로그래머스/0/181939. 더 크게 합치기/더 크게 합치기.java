class Solution {
    public int solution(int a, int b) {
        String ab = "" + a + b;
        String ba = "" + b + a;
        
        int num1 = Integer.parseInt(ab);
        int num2 = Integer.parseInt(ba);
        
        return Math.max(num1, num2);
    }
}