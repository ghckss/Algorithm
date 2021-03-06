package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DividableNumbers{
    public int[] solution(int[] arr, int divisor){
        int[] answer = {-1};

        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0) list.add(arr[i]);
        }

        if(list.size()==0) return answer;
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
