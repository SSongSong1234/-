class Solution {
    public int[] solution(int money) {
        
        int a = money/5500; // 몇잔 마실수있는지
        int b = money%5500; // 남은 잔돈
        int[] answer = {a,b};
        return answer;
    }
}