package level1;

public class Year2016 {
    public String solution(int a, int b) {
        String answer = "";

        String[] weekday = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int monthDate = 0;
        for(int i=0; i<=a-1; i++){
            monthDate += day[i];
        }
        int date = monthDate + b;
        answer = weekday[date%7];

        return answer;
    }
}
