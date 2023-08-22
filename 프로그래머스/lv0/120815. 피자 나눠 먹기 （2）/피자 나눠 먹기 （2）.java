class Solution {
    public int solution(int n) {
        int su = 6;
        while(su<n){
            su += 6;
        }
        while(su%n != 0){
            su += 6;
        }
        int answer = su/6;
        return answer;
    }
}