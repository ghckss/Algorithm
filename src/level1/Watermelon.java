package level1;

public class Watermelon {
    public String solution(int n) {
        String answer = "";

        for(int i=1; i<=n; i++) {
            answer += i%2==1 ? "수" : "박";
        }
        return answer;
    }
}
