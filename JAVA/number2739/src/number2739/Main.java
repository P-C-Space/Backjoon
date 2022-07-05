package number2739;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		for(int i = 1;i<10;i++) {
			System.out.println(number + " * " + i + " = " + number*i);
		}
		
		s.close();
	}

}
