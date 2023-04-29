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
    }
}
