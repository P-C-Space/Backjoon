import java.util.Scanner;

public class p25314{
    // Long int = 4byte
    // Long Long int = 8byte
    // Long * N int = ????
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // N은 4~1000 4의 배수
        int N = s.nextInt();

        // 4로 나눈 수만큼 반복하여 long+공백 출력
        for (int i =0;i<N/4;i++){
            System.out.print("long ");
        }
        
        System.out.println("int");
        
        s.close();
    }
}