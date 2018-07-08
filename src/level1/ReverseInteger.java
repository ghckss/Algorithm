package level1;

public class ReverseInteger {
    public int[] solution(long n) {
        String stringValue = String.valueOf(n);
        char[] charArray = stringValue.toCharArray();
        int[] answer = new int[stringValue.length()];

        for(int i=0; i<stringValue.length(); i++) {
            answer[i] = charArray[stringValue.length()-1-i]-'0';
        }
        return answer;
    }
}
