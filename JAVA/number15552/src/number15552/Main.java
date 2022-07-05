package number15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			int size = Integer.parseInt(bf.readLine());
			
			int ary[] = new int[size];
			for(int i = 0;i<size;i++) {
				 String temp = bf.readLine();
				 StringTokenizer st = new StringTokenizer(temp);
				 int a = Integer.parseInt(st.nextToken());
				 int b = Integer.parseInt(st.nextToken());
				 ary[i] = a+b;
			}
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			
			
			for(int j = 0;j<size;j++) {
				bw.write(ary[j]+"\n");	
			}
			bw.flush();
			bf.close();
			bw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
