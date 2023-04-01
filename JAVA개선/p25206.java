import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class p25206 {
    public static void main(String[]args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Size = 20;
        String[][] gd = new String[Size][3];

        double sum = 0.0;
        double count = 0;
        try{
         for(int i = 0;i<Size;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            gd[i][0] = st.nextToken();
            gd[i][1] = st.nextToken();
            gd[i][2] = st.nextToken();

            Double score = Double.parseDouble(gd[i][1]);
            String text = gd[i][2];

            if(text.charAt(0) == 'A'){
                if(text.charAt(1) == '+'){ //A+
                    sum += (score * 4.5);
                    count+=score;
                }
                else{ // A0
                    sum += (score * 4.0);
                    count+=score;
                }
            }
            else if(text.charAt(0) == 'B'){
                if(text.charAt(1) == '+'){ //B+
                    sum += (score * 3.5);
                    count+=score;
                }
                else{ // B0
                    sum += (score * 3.0);
                    count+=score;
                }
            }
            else if(text.charAt(0) == 'C'){
                if(text.charAt(1) == '+'){ //C+
                    sum += (score * 2.5);
                    count+=score;
                }
                else{ // C0
                    sum += (score * 2.0);
                    count+=score;
                }
            }
            else if(text.charAt(0) == 'D'){
                if(text.charAt(1) == '+'){ //D+
                    sum += (score * 1.5);
                    count+=score;
                }
                else{ // D0
                    sum += (score * 1.0);
                    count+=score;
                }
            }
            else if(text.charAt(0) == 'F'){
                count+=score;
            }
        }
        if(sum != 0){
        System.out.println(String.format("%.6f",sum/count));
        }
        else{
            System.out.println(String.format("%.6f",sum));
        }
        br.close();
    }catch(IOException e){
        e.printStackTrace();
    }
        

    }
}
