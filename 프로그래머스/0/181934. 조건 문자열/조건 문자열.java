class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String answer = ineq + eq;
        if (answer.equals(">=")) return n >= m ? 1 : 0;
        if (answer.equals("<=")) return n <= m ? 1 : 0;
        if (answer.equals(">!")) return n > m ? 1 : 0;
        return n < m ? 1 : 0;
    }
}