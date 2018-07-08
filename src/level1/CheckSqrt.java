package level1;

public class CheckSqrt {
    public long solution(long n) {
        long answer = 0;
        int x = (int) Math.sqrt(n);
        System.out.println(Math.sqrt(n));
        System.out.println(x);
        answer = Math.sqrt(n)-x == 0 ? (x+1)*(x+1) : -1;
        return answer;
    }
}
