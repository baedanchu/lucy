class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for(int i=0; i<num_list.length; ++i){
	        answer[i] = num_list[i];
        }
        int k = num_list.length-1;
        if(answer[k]-answer[k-1]>0){
            answer[k+1] = answer[k] - answer[k-1];
        }else{
            answer[k+1] = answer[k]*2;
        }
        return answer;
    }
}