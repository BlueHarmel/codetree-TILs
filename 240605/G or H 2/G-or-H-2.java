import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] ghArray = new String[100];
        Arrays.fill(ghArray,"");
        for (int i =0; i<n;i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int charPos = Integer.parseInt(stk.nextToken());
            ghArray[charPos-1] = stk.nextToken();
        }

        // 오로지 G / H 만 있는 경우 : 
        // G/H가 동일한 갯수가 있는 경우 : 
        int maxDist = Integer.MIN_VALUE;
        int tempDist = 0;
        int gCnt;
        int hCnt;
        for (int i =0; i<100;i++){
            if(ghArray[i].equals("G") || ghArray[i].equals("H")){
                for (int j =i;j<100;j++){
                    gCnt = 0;
                    hCnt = 0;
                    if(ghArray[j].equals("G") || ghArray[j].equals("H")){
                        for(int k=i;k<=j;k++){
                            if(ghArray[k].equals("G")){
                                gCnt++;
                            }
                            else if(ghArray[k].equals("H")){
                               hCnt++;
                            }
                        }
                        if(gCnt==hCnt || gCnt==0 || hCnt ==0 ){
                            tempDist = j-i;
                            if(tempDist>maxDist) {
                                maxDist = tempDist;
                                // System.out.println("i: "+i+" j: "+j +" gCnt: "+gCnt +" hCnt: "+hCnt+ " tempDist: " +tempDist);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(maxDist);
    }
}