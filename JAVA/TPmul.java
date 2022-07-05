import java.util.Scanner;
public class TPmul {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int F = n1*(n2%10);
        System.out.println(F);
        int S = n1*(n2%100 - n2%10)/10;
        System.out.println(S);
        int T = n1*(n2/100);
        System.out.println(T);
        System.out.println(T*100+S*10+F);
        s.close();
    }
}
