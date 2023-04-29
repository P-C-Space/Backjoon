import java.util.Scanner;

public class p5086 {
    static int a,b;
    public static void main(String[]args) {
        Scanner s= new Scanner(System.in);
        while(true){
           a = s.nextInt();
           b = s.nextInt(); 
           if(a%b == 0){
            System.out.println("multiple");
           }
           else if(a%b != 0){
            System.out.println("factor");
           }
           else{

           }
        }  
    }
}
