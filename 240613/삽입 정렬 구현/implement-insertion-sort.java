import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] numArray = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine()," ");

        for(int i =0; i<n;i++){
            numArray[i] = Integer.parseInt(stk.nextToken());
        }

        for (int i =1;i<n;i++){
            int key = numArray[i];
            for (int j=i-1;j>=0;j--){
                if(numArray[j+1]<numArray[j]){
                    System.out.println(numArray[i]);
                    numArray[j+1]=numArray[j];
                    System.out.println(numArray[i]);
                } else {
                    numArray[j+1]=key;
                    break;
                }
            }
        }
        for(int num:numArray){
            System.out.print(num+" ");
        }
    }
}