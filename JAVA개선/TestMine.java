import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class digit_Convertor{
    public digit_Convertor(){}  
    
    public int binary_to_decimal(String b){
        int count = 1;
        int sum = 0;
        for(int i = b.length()-1;i>=0;i--){
            sum += Character.getNumericValue(b.charAt(i)) * count;
            count *= 2;
        }
        return sum;
    }

    public String decimal_to_binary(int d){
        String b = "";

        while(d>0){
            // decimal을 나눈 나머지를 b문자열 앞에 추가
            b = d%2 + b;
            d/=2;
        }
        return b;
    }

    public double real_binaryToDecimal(String b){
        char sign;
        sign = b.charAt(0) == '0' ? '+' : '-';

        String Exponent = b.substring(1,16);
        String Mantissa = b.substring(16, b.length());

        double Exponent_sum = 0;
        int Exponent_count = 1;
        for(int i = Exponent.length()-1;i>=0;i--){
            Exponent_sum += Character.getNumericValue(Exponent.charAt(i)) * Exponent_count;
            Exponent_count *= 2;
        }

        double Mantissa_count = 0.5;
        double Mantissa_sum = 0;

        for(int j =0;j<Mantissa.length();j++){
            if(Mantissa.charAt(j) == '1'){
                Mantissa_sum += Mantissa_count;
            }
            Mantissa_count /= 2;
        }

        double result = Exponent_sum + Mantissa_sum;
        
        return sign == '+' ? result : -result;

    }

    public String Decimal_To_real_binary(double d){
        String result = "";
        result = d >= 0 ? "0 " : "1 ";

        String s_Exponent = "";

        Long Exponent = (long)d;
        double Mantissa = d - Exponent; // 소수 부분

        while(Exponent > 0){
            s_Exponent = Exponent % 2 + s_Exponent;
            Exponent /=2 ;
        }

        while(s_Exponent.length() < 15){
            s_Exponent = "0" + s_Exponent;
        }

        result += s_Exponent + " ";

        //System.out.println("Mantissa : " + Mantissa);

        String s_Mantissa = ""; // 소수점부분 저장 문자열
             
        for(int i = 0; i<16;i++){
            Mantissa = Mantissa * 2.0;
            if(Mantissa >= 1){
                Mantissa -= 1;
                s_Mantissa += "1";
            }
            else{
                s_Mantissa += "0";
            }
        }

        result += s_Mantissa;

        return result; 
    }
}


public class TestMine {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a binary number : ");
        String s_binary = br.readLine();
        digit_Convertor dc = new digit_Convertor();

        int i_decimal_result = dc.binary_to_decimal(s_binary);  
        System.out.println("change decimal : " + i_decimal_result);

        String s_binary_result = dc.decimal_to_binary(i_decimal_result);
        System.out.println("return binary value : " + s_binary_result);


        System.out.print("Enter the binary fractions value : ");
        String s_binary2 = br.readLine();
        double d_decimal_result = dc.real_binaryToDecimal(s_binary2);
        System.out.println("change decimal : " + d_decimal_result);
        System.out.println("change binary : " + dc.Decimal_To_real_binary(d_decimal_result));
    }

}
