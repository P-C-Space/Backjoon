import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4948_1 {
    static boolean[] isPrime = new boolean[1234]; // 주어진 최대 값의 두배
    

    // 에라토스테네스의 체
    // n의 배수 삭제
    public static void setPrime() {
        isPrime[0] = isPrime[1] = true; // 0 = 1은 소수가 아님
        
        for(int i = 2;i< isPrime.length;i++){ // 2부타 시작
            if(isPrime[i]){ // 이미 소수 판별 후면 건너 뛰기
                continue;
            }

            for(int j = i * i; j < isPrime.length; j += i){
                isPrime[j] = true;
            }
        }
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        setPrime();

        for(int i = 0;i<isPrime.length;i++){
            System.out.println(i + " : " + isPrime[i]);
        }
    }

}
