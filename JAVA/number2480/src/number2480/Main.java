package number2480;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		if(n1 == n2 && n2 == n3) {
			System.out.println(10000+(n2*1000));
		}
		else if(n1 == n2 || n2 == n3 || n1 == n3) {
			if(n1 == n2 || n1 == n3) {
				System.out.println(1000+(n1*100));
			}
			else
				System.out.println(1000+(n2*100));
		}
		else {
			int Max = Math.max(n1,Math.max(n2, n3));
			System.out.println(Max*100);
		}
		s.close();
	}

}
