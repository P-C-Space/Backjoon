import java.util.Scanner;

public class p10988 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int check = 1;

        String word_tmp = s.nextLine();
        char word[] = new char[word_tmp.length()];

        for(int i =0;i<word_tmp.length();i++){
            word[i] = word_tmp.charAt(i);
        }

        int a,b;
        if(word.length%2 == 1){
            a = word.length/2-1;
            b = word.length/2+1;
            for(int i = 0;i<word.length/2;i++){
                if(word[a--] != word[b++]){
                    check = 0;
                }
            }
        }
        else{
            a = word.length/2-1;
            b = word.length/2; 
            for(int i = 0;i<word.length/2;i++){
                if(word[a--] != word[b++]){
                    check = 0;
                }
            }
        }
        System.out.println(check);
        s.close();
    }
}
