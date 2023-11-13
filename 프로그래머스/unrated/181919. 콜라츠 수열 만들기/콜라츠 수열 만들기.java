import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(n);
        int k = n;
        while(true){
            if(k%2==0){
                k = k/2;
            }else{
                k = 3*k+1;
            }
            list.add(k);
            if(k == 1) break;
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}