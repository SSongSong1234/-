class Solution {
    public int solution(int[] dot) {
  int answer = 0;

        // 1은 양수, 0은 음수를 뜻함
        int x = dot[0] > 0 ? 1 : 0;
        int y = dot[1] > 0 ? 1 : 0;


        if ( x == 1 && y == 1) {
            answer = 1;
        }
        else if ( x == 0 && y == 1) {
            answer = 2;
        }
        else if ( x == 0 && y == 0) {
            answer = 3;
        }
        else if ( x == 1 && y == 0) {
            answer = 4;
        }

        return (answer);
    }
}