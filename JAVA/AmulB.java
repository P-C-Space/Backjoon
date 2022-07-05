import java.util.Scanner;
public class AmulB{
    public static void main(String[] args)
    {
        int n1 = 0,n2 = 0;
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        n2 = s.nextInt();
        System.out.println(n1*n2);
        s.close();
    }
}