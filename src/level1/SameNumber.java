package level1;

import java.util.ArrayList;
import java.util.List;

public class SameNumber {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> list = new ArrayList();
        int i;

        for(i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]) {
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length-1]);
        answer = new int[list.size()];
        for(i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
