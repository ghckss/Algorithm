package level1;

public class CaesarCipher {
    public String solution(String s, int n) {
        char[] charArray = s.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            if(charArray[i]==' ') charArray[i]=' ';
            else if(charArray[i]<91 && charArray[i]+n>90) charArray[i] = (char) (64+(charArray[i]+n)-90);
            else if(charArray[i]+n>122) charArray[i] = (char) (96+charArray[i]+n-122);
            else charArray[i] = (char) (charArray[i]+n);
        }
        String answer = new String(charArray);
        return answer;
    }
}
