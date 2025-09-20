class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        int max = 0;
        
        for(int s : sides){
            sum += s;
            if(s>max){
                max = s;
            }
        }
        int other = sum - max;
        if(max < other){
            return 1;
        }else{
            return 2;
        }
        
    }
}