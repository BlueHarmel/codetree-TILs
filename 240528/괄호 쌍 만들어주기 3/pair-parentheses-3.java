import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String gualho = br.readLine();
        
        int sumVal=0;
        for(int i =0; i<gualho.length();i++){
            for (int j = i; j < gualho.length();j++){
                if(gualho.charAt(i)=='(' && gualho.charAt(j)==')'){
                    sumVal+=1;
                }
            }
        }
        System.out.println(sumVal);
        // StringTokenizer stk = new StringTokenizer(br.readLine());

        
    }
}