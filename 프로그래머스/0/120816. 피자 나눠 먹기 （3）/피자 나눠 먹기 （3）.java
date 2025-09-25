class Solution {
    public int solution(int slice, int n) {
    int a = n/slice;
    if(n%slice==0){
        return a;
    } else{
        return (a)+1;
    }
        
   }
}
    
