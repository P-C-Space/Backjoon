package number2525;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		int t = s.nextInt();
		
		if(m + t >= 60) {
			int k = (m+t) / 60;
			m = (m+t) % 60;
			h += k;
			if(h > 23) {
				h -= 24;
			}
		}
		else {
			m +=t;
		}
		System.out.println(h + " " + m);
		s.close();
	}

}
