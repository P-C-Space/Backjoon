package number11022;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int ary[] = new int[size];
		int a[] = new int[size];
		int b[] = new int[size];
		for(int i =0;i<size;i++) {
			a[i] = s.nextInt();
			b[i] = s.nextInt();
			ary[i] = a[i]+b[i];
		}
		for(int i = 0;i<size;i++) {
			System.out.println("Case #"+ (i+1) + ": "
					+a[i]+" + "+b[i] + " = " +ary[i]);
		}
		s.close();
	}

}
