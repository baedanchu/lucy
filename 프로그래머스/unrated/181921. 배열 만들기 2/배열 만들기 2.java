import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        // 답을 담을 리스트 객체 생성
        List<Integer> list = new ArrayList<>();
        
        // l 부터 r 까지의 정수를 검토
        for(int i=l; i<=r; ++i){
            // 문자로 변환
            String res = i+"";
            // 문자의 전체 모두 조건에 부합하는지 확인할 변수 선언
            int count = 0;
            // 문자의 길이 만큼 for 문으로 5, 0 인지 확인
            for(int j=0; j<res.length(); ++j){
                if(res.charAt(j) == '0' || res.charAt(j) == '5'){
                    count++;
                }
            }
            // 문자의 길이와 count 변수 값이 같다면, 전체 문자 모두 조건에 부합됨을 알 수 있다.
            if(res.length() == count){
                list.add(i);
            }
        }
        int [] answer = {};
        // 조건에 부합하는 정수가 없는 경우
        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{ // 조건에 부합하는 정수가 있는 경우
            // list 의 크기만큼 답안 배열을 만들기
            answer = new int[list.size()];
            for(int i=0; i<answer.length; ++i){
                // list 값을 배열에 옮기기
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}