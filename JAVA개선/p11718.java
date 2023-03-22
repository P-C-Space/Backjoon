import java.util.Scanner;

public class p11718 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        while(s.hasNextLine()){
            String word = s.nextLine();
            System.out.println(word);
        }
        s.close();
    }
}
