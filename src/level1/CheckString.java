package level1;

import java.util.regex.*;
//s.length==4or6 and only numbers
public class CheckString {
    public boolean solution(String s) {
        return Pattern.compile("^[0-9]{4}$").matcher(s).find() || Pattern.compile("^[0-9]{6}$").matcher(s).find();
}
}
