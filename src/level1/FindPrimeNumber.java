package level1;

public class FindPrimeNumber {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            boolean condition = true;
            for(int j=2; j<i; j++) {
                if(i%j==0) {
                    condition=false;
                    break;
                }
            }
            if(condition==true) answer++;
        }
        return answer;
    }
}
