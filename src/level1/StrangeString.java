package level1;

public class StrangeString {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        int counter = 0;
        for(int i=0; i<s.length(); i++) {
            if(charArray[i]==' ') {
                counter=0;
                continue;
            }
            if(counter%2==0) {
                charArray[i]=Character.toUpperCase(charArray[i]);
                counter++;
            } else if(counter%2==1) {
                charArray[i]=Character.toLowerCase(charArray[i]);
                counter++;
            }
        }
        return new String(charArray);
    }
}
