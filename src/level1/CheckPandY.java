package level1;

public class CheckPandY {
    public boolean solution(String s) {
        int counter = 0;
        String upperString = s.toUpperCase();
        for(int i=0; i<s.length(); i++) {
            if(upperString.charAt(i)=='P') counter++;
            if(upperString.charAt(i)=='Y') counter--;
        }
        return counter==0;
    }
}
