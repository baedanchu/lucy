class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

for(int i=0; i<queries.length; ++i){
	int s = queries[i][0];
	int e = queries[i][1];
	int k = queries[i][2];
	int count = 0;
	int imsi = 0;
    boolean t = false;
	for(int j=s; j<=e; ++j){
		if(arr[j]>k){
			t = true;
			if(count == 0){
				imsi = arr[j];
				count++;
			}else{
				if(arr[j]<=imsi){
					imsi = arr[j];
				}
			}
		}
	}
	if(!t){
		answer[i] = -1;
	}else{
		answer[i] = imsi;
	}
}
        return answer;
    }
}