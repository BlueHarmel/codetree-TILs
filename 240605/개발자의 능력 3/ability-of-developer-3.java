import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine()," ");

        int[] algoScore = new int[6];
        int algoScoreSum = 0;
        for(int i=0;i<6;i++){
            algoScore[i] = Integer.parseInt(stk.nextToken());
            algoScoreSum+=algoScore[i];
        }

        int minVal = Integer.MAX_VALUE;
        for (int i =0; i<4;i++){
            for(int j =i+1; j<5;j++){
                for(int k=j+1; k<6;k++){
                    int tempVal = algoScoreSum-(algoScore[i]+algoScore[j]+algoScore[k])*2;
                    if(tempVal>=0 && tempVal<minVal)
                        minVal = tempVal;
                }
            }
        }

        System.out.println(minVal);
    }
}