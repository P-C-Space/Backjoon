package number14681;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		if(x > 0 && y > 0) {
			System.out.println("1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("3");
		}
		else if(x > 0 && y < 0) {
			System.out.println("4");
		}
		s.close();
	}

}
