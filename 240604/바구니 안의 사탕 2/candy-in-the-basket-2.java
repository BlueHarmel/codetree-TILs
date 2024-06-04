import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        int[] candyArray = new int[100];
        for (int i =0 ; i<n;i++) {
            stk = new StringTokenizer(br.readLine());
            int candyNum = Integer.parseInt(stk.nextToken());
            int candyPos = Integer.parseInt(stk.nextToken());
            candyArray[candyPos-1] = candyNum;
        }

        int candySum = Integer.MIN_VALUE;
        for (int i =k; i<100-k;i++){
            int tempSum = 0;

            for (int j =i-k; j<=(i+k);j++){
                tempSum+=candyArray[j];
            }
            if (candySum < tempSum){
                candySum = tempSum;
            }
        }
        System.out.println(candySum);
    }
}