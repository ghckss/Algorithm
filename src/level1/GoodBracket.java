package level1;

public class GoodBracket {
    public boolean solution(String s) {
        boolean answer = true;
        int counter = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') counter+=1;
            if(s.charAt(i)==')') counter-=1;
            if(counter<0) return false;
        }
        if(counter!=0) answer = false;
        return answer;
    }
}
