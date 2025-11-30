class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        char target = letter.charAt(0); 

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c != target) {
                sb.append(c); 
            }
        }
        return sb.toString();
    }
}