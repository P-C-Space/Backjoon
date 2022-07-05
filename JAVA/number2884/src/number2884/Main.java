package number2884;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		if(m >= 45) {
			m -= 45;
		}
		else
		{
			m = 60 - (45-m);
			if(h == 0) {
				h = 23;
			}
			else
				h--;
		}
		System.out.println(h + " " + m);
		s.close();
	}

}
