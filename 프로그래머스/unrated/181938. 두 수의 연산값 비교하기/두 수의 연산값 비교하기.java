class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String su1 = ""+a+b;
        int su2 = 2*a*b;
        if(Integer.parseInt(su1)- su2 >=0){
            answer = Integer.parseInt(su1);
        }else{
            answer = su2;
        }
        return answer;
    }
}