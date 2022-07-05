package number11021;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int ary[] = new int[size];
		for(int i =0;i<size;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			ary[i] = a+b;
		}
		for(int i = 0;i<size;i++) {
			System.out.println("Case #"+ (i+1) + ": "+ary[i]);
		}
		s.close();
	}

}
