class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<number.length(); ++i){
            int a = (int)number.charAt(i)-48;
            sum += a;
        }
        while(true){
            if(sum<9) break;
            sum -= 9;
        }
        answer = sum;
        return answer;
    }
}