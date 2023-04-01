public class p25206_1 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] score_text = {"A+","A0","B+","B0","C+","C0","D+","D0","P","F"};
        double[] score_int = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0 };
        
        String[][] gd = new String[Size][3];

        double sum = 0.0;
        double count = 0;

        for (int i =0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            gd[i][0] = st.nextToken();
            gd[i][1] = st.nextToken();
            gd[i][2] = st.nextToken();

            for(int j =0;j<10;j++){
                if(gd[i][0].equals(score_text[j])){
                    count+=score_int[j];
                    sum += (score_int[j] * Double.parseDouble(gd[i][1]));
                }
            }
        }
        if(sum > 0){
            System.out.println(String.format("%.6f",sum/count));
            }
            else{
                System.out.println(String.format("%.6f",sum));
            }
    }
}
