package level1;

public class StringToInteger {
    public int solution(String s) {
        return s.charAt(0)!='+' ? Integer.parseInt(s) : Integer.parseInt(s.substring(1, s.length()));
    }
}
