import java.util.Scanner;

public class p25206 {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        String object_name;
            Double score;
            String text;
        double sum = 0.0;
        int count = 0;
         for(int i = 0;i<20;i++){
            object_name = s.nextLine();
            score = s.nextDouble();
            text = s.nextLine();
            if(text.charAt(0) == 'A'){
                if(text.charAt(1) == '+'){ //A+
                    sum += (score * 4.5);
                    count++;
                }
                else{ // A0
                    sum += (score * 4.0);
                    count++;
                }
            }
            else if(text.charAt(0) == 'B'){
                if(text.charAt(1) == '+'){ //B+
                    sum += (score * 3.5);
                    count++;
                }
                else{ // B0
                    sum += (score * 3.0);
                    count++;
                }
            }
            else if(text.charAt(0) == 'C'){
                if(text.charAt(1) == '+'){ //C+
                    sum += (score * 2.5);
                    count++;
                }
                else{ // C0
                    sum += (score * 2.0);
                    count++;
                }
            }
            else if(text.charAt(0) == 'D'){
                if(text.charAt(1) == '+'){ //D+
                    sum += (score * 1.5);
                    count++;
                }
                else{ // D0
                    sum += (score * 1.0);
                    count++;
                }
            }
        }
        System.out.println(sum/count);
        s.close();
    }
}
