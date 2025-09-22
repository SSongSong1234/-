class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
       int[] result = new int[num2 - num1 + 1];
        
        // num1부터 num2까지 반복하며 result에 채우기
        int index = 0;
        for (int i = num1; i <= num2; i++) {
            result[index] = numbers[i];
            index++;
        }
        
        return result;
    
    }
}