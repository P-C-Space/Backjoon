import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1550_1 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        Long hex_to_decimal = 0L;
        int count = 0;
        for(int i =n.length()-1;i>=0;i--){

            n.charAt()
            hex_to_decimal += Character.getNumericValue(n.charAt(i)) * (long)Math.pow(16, count++);
        }
        System.out.println(hex_to_decimal);
    }
}
