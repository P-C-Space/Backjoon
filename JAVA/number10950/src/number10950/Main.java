package number10950;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int array[] = new int[n];
		
		for(int i = 0;i<n;i++) {
			int A = s.nextInt();
			int B = s.nextInt();
			array[i] = A+B;
		}
		for(int i = 0;i<n;i++) {
			System.out.println(array[i]);
		}
		s.close();
	}

}
