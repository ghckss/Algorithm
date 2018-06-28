package level1;

public class StringSort {
    public String[] solution(String[] strings, int n) {
        String temp = "";
        for(int i=0; i<strings.length-1; i++) {
            for(int j=1; j+i<strings.length; j++) {
                if(strings[i].charAt(n)>strings[i+j].charAt(n)) {
                    temp = strings[i];
                    strings[i] = strings[i+j];
                    strings[i+j] = temp;
                }
                else if(strings[i].charAt(n)==strings[i+j].charAt(n) && strings[i].compareTo(strings[i+j])>0) {
                    temp = strings[i];
                    strings[i] = strings[i+j];
                    strings[i+j] = temp;
                }
            }
        }
        return strings;
    }
}
