package level1;

public class CenterChar {
    public String solution(String s){
        String answer = "";

        int center = s.length()/2;
        if(s.length()%2==1){
            answer += s.charAt(center);
        } else{
            answer += s.substring(center-1, center+1);
        }
        return answer;
    }
}
