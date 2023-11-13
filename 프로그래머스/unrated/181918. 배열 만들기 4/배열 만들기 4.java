import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> list = new ArrayList<>();
        int j = 0;
        while(true){
            if(j>=arr.length) break;
            int s = list.size();
            if(s==0){
                list.add(arr[j]);
                j += 1;
            }else{
                int k = list.get(s-1);
                if(k<arr[j]){
                    list.add(arr[j]);
                    j += 1;
                }else{
                    list.remove(s-1);
                }
            }    
        }
        stk = list.stream().mapToInt(i->i).toArray();
        return stk;
    }
}