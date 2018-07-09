package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerToDescend {
    public long solution(long n) {
        List<Long> list = new ArrayList();
        String stringAnswer = "";

        for(; n>0;) {
            list.add(n%10);
            n=n/10;
        }

        Long[] arr = new Long[list.size()];
        for(int i=0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);
        for(int i=list.size()-1; i>=0; i--) {
            stringAnswer+=arr[i];
        }
        return Long.valueOf(stringAnswer);
    }
}
