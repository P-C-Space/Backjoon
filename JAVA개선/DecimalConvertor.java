import java.util.Scanner;

public class DecimalConvertor {
    public static int binaryToDecimal(String binaryValue) {
        int decimal = 0;
        int count = 1;
        for (int i = binaryValue.length() - 1; i >= 0; i--) {
            char c = binaryValue.charAt(i);
            if (c == '1') {
                decimal += count;
            }
            count *= 2;
        }
        return decimal;
    }

    public static String decimalToBinary (int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2)+ binary;
            decimal /= 2;
        }

        return binary;
    }

    public static String decimalFractionToBinary(double decimal) {

        StringBuilder sb = new StringBuilder();

        if (decimal < 0) {
            sb.append(1).append(" ");
        } else {
            sb.append(0).append(" ");
        }
        decimal = Math.abs(decimal);

        String intBinary = "";
        int intPart = (int) decimal;
        double fractionPart = decimal - intPart;

        for (int i = 0; i < 15; i++){
            intBinary = (intPart % 2) + intBinary;
            intPart /= 2;
        }
        sb.append(intBinary).append(" ");

        for (int i = 0; i < 16; i++) {
            int temp = (int) (fractionPart * 2);
            boolean isOne = false;
            if (temp == 1) {
                sb.append(1);
                isOne = true;
            } else {
                sb.append(0);
            }
            if (isOne) {
                fractionPart = (fractionPart * 2) -1;
            }
            else {
                fractionPart = (fractionPart * 2);
            }
        }

        return sb.toString();
    }

    public static double binaryFractionToDecimal(String binaryValue) {

        char binary = '+';

        char sign = binaryValue.charAt(0);
        if (sign == '1') {
            binary = '-';
        }

        int firstCount = 1;
        int intPart = 0;
        for (int i = 15; i >= 1; i--) {
            char ch = binaryValue.charAt(i);
            if (ch == '1') {
                intPart += firstCount;
            }
            firstCount *= 2;
        }

        double secondCount = 1;
        double fractionPart = 0;
        for (int i = 16; i < binaryValue.length(); i++) {
            char ch = binaryValue.charAt(i);
            secondCount /= 2;
            if (ch == '1') {
                fractionPart += secondCount;
            }
        }

        double result = (double) (intPart) + fractionPart;
        return (binary == '+' ? result : -result );
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalConvertor decimalConvertor = new DecimalConvertor();
        
        System.out.print("Enter a binary value : ");
        String binaryValue = sc.nextLine();

        int decimal = decimalConvertor.binaryToDecimal(binaryValue);
        System.out.println(decimal);

        String binary = decimalConvertor.decimalToBinary(decimal);
        System.out.println(binary);

        System.out.print("Enter the binary fractions value : ");
        String binaryValue2 = sc.nextLine();
        double decimalFraction = decimalConvertor.binaryFractionToDecimal(binaryValue2);
        System.out.println(decimalFraction);
        
        String binaryFraction = decimalConvertor.decimalFractionToBinary(decimalFraction);
        System.out.println(binaryFraction);


    }
}
