import java.lang.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        StringBuffer sb = new StringBuffer(my_string);
        for(int i=0; i<queries.length; ++i){
            int a = queries[i][0];
            int b = queries[i][1];
            StringBuffer rep = new StringBuffer(answer.substring(a,b+1));
            rep.reverse();
            sb.delete(a,b+1);
            String res = new String(rep);
            sb.insert(a,res);
            answer = new String(sb);
        }
        return answer;
    }
}