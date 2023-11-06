class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int x = 1;
        for(int i=0; i<num_list.length; ++i){
	        x *= num_list[i]; 
        }

        int sum = 0;
        for(int i=0; i<num_list.length; ++i){
	        sum += num_list[i];
        }

        sum *= sum;

        if(x-sum>=0){
	        answer = 0;
        }else{  
	        answer = 1;
        }
        return answer;
    }
}