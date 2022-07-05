import java.util.Scanner;
public class AdivB {
    public static void main(String[] args)
    {
        double n1 = 0,n2 = 0;
        Scanner s = new Scanner(System.in);
        n1 = s.nextDouble();
        n2 = s.nextDouble();
        System.out.println((n1/n2));
        s.close();
    }
}
