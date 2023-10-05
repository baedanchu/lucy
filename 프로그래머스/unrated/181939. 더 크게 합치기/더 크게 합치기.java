class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String su1 = ""+a+b;
        String su2 = ""+b+a;
        int su = Integer.parseInt(su1) - Integer.parseInt(su2);
        if(su>=0){
            answer = Integer.parseInt(su1);
        }else{
            answer = Integer.parseInt(su2);
        }
        return answer;
    }
}