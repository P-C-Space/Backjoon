<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p1427 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        String tmp = s.nextLine();

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<tmp.length();i++){
            arr.add(Character.getNumericValue(tmp.charAt(i)));
        }

        Collections.sort(arr,Collections.reverseOrder());

        for(int i : arr){
            sb.append(i);
        }

        System.out.println(sb);
        s.close();
=======
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.IOException;

public class p1427 {
    public static void main(String[] args){

        try{
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));

        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(bf.readLine(),"");
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            arr.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(arr);
        Collections.sort(arr);

        System.out.println(arr);
        
        bf.close();
    }catch(Exception e){
        e.printStackTrace();


    }
>>>>>>> 198001104574e44dca74f16bd2609340d3d4e5cc
    }
}
