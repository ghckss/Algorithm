package level1;

public class CheckSqrt {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        return sqrt==(int) sqrt ? (long)Math.pow(sqrt+1, 2) : -1;
    }
}
