import java.util.Scanner;

// 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다.

// A+B+C의 값을 출력한다.
public class p11382{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        // String을 받아 10^12을 처리
        String a = s.next();
        String b = s.next();
        String c = s.next();

        // Long형으로 바꾸어 처리
        System.out.println(Long.parseLong(a)+Long.parseLong(b)+Long.parseLong(c));
        
        s.close();
    }
}