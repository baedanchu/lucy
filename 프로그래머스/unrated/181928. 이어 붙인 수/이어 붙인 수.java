class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String su1 = "";
        String su2 = "";
        
        for(int i=0; i<num_list.length; ++i){
            if(num_list[i]%2 == 0){
                su2 += num_list[i];
            }else{
                su1 += num_list[i];
            }
        }
        
        int a = Integer.parseInt(su1);
        int b = Integer.parseInt(su2);
        
        answer = a+b;
        return answer;
    }
}