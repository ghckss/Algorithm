import level1.StringSort;

public class Main {
    public static void main(String[] args){
        StringSort solution = new StringSort();
        String[] sol = {"abce", "abcd", "cdx", "wevq", "wewe", "cc", "noon", "moon"};
        System.out.println(solution.solution(sol, 1));
    }
}