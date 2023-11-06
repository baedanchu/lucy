class Solution {
    public String solution(String code) {
        int mode = 0;
        String answer = "";

        for(int i=0; i<code.length(); ++i){
            char a = code.charAt(i);
	        if(mode == 0){
		        if(a == '1'){
			        mode = 1;
		        }else {
			        if(i%2 == 0){
				        answer += a;
			        }
		        }
            }else{
                if(a == '1'){
                    mode = 0;
                }else{
                    if(i%2 != 0){
                        answer += a;
                    }
                }
            }
        }
        if(answer.equals("")){
            answer = "EMPTY";
        }

        return answer;
    }
}