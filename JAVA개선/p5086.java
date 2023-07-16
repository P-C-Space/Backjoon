import java.util.Scanner;

public class p5086 {
    // 약수를 구하는 함수와 함께 사용
    // static boolean divisor_check(int a,int b){
    //     int max = a > b ? a : b;
    //     int min = a > b ? b : a;
    //     for(int i = 1;i<max;i++){
    //         if(max % i == 0){
    //             if(min == i){
    //                 return true; // 존재시 1
    //             }
    //         }
    //     }
    //     // 없을시 0
    //     return false;
    // }
    // static int a,b;
    // public static void main(String[]args) {
    //     Scanner s= new Scanner(System.in);
    //     while(true){
    //        a = s.nextInt();
    //        b = s.nextInt(); 
    //        if(a == 0 && b == 0){
    //             break;
    //        }


    //        if(divisor_check(a,b)){
    //         System.out.println("factor");
    //        }
    //        else if(a%b == 0 || b % a == 0){
    //         System.out.println("multiple");
    //        }
    //        else{
    //         System.out.println("neither");
    //        }
    //     }  
    //     s.close();
    // }
    static int a,b;
    public static void main(String[]args) {
        Scanner s= new Scanner(System.in);
        while(true){
           a = s.nextInt();
           b = s.nextInt(); 
           if(a == 0 && b == 0){
                break;
           }


           if(b % a == 0){
            System.out.println("factor");
           }
           else if(a % b == 0 ){
            System.out.println("multiple");
           }
           else{
            System.out.println("neither");
           }
        }  
        s.close();
    }
}
