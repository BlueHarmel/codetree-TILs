import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine()," ");
        
        int[] numArray = new int[n];
        for (int i =0 ;i<n;i++){
            numArray[i] = Integer.parseInt(stk.nextToken());
        }

        for (int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(numArray[j]>numArray[j+1]){
                    int temp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;
                }
            }
        }
        for (int num : numArray)
            System.out.print(num + " ");   
    }
}