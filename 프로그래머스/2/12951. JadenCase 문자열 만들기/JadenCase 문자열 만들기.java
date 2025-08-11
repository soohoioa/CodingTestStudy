class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isStart = true; 
        
        for (char c : s.toLowerCase().toCharArray()) {
            if (isStart && Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
                isStart = false;
            } else {
                sb.append(c); 
                if (c == ' ') {
                    isStart = true; 
                } else {
                    isStart = false;
                }
            }
        }
        return sb.toString();
    }
}
