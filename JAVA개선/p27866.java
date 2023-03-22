import java.util.Scanner;

public class p27866 {
    public static void main(String[] args){
        // 단어 word
        // 정수 n
        // n번째 문자 출력
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        int n = s.nextInt();

        // charAt문자열의 특정 문자 출력
        System.out.println(word.charAt(n-1));
        s.close();
    }
}
