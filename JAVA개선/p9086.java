import java.util.Scanner;

public class p9086 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        for(int i =0;i<n;i++){
            String word = s.nextLine();
            int len = word.length()-1;
            System.out.print(word.charAt(0));
            System.out.print(word.charAt(len));
            System.out.println();
        }
        s.close();
    }
}
