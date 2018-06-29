package level1;

import java.util.Arrays;

public class StringDescending {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        char[] newCharArray = new char[charArray.length];
        for(int i=0; i<charArray.length; i++) {
            newCharArray[i] = charArray[charArray.length-1-i];
        }
        String answer = new String(newCharArray);
        return answer;
    }
}
