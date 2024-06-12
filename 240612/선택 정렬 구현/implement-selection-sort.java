import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine()," ");

        int[] numArray = new int[n];
        for(int i =0;i<n;i++){
            numArray[i] = Integer.parseInt(stk.nextToken());
        }

        for (int i =0; i<n;i++){
            int min = i;
            for (int j =i;j<n;j++){
                if(numArray[i]>numArray[j]){
                    int temp = numArray[j];
                    numArray[j] = numArray[i];
                    numArray[i] = temp;
                }
            }
            System.out.print(numArray[i]+" ");
        }
    }
}