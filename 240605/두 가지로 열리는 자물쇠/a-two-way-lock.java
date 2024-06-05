import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine()," ");
        int[] lockPassword1 = new int[3];
        for (int i=0;i<3;i++){
            lockPassword1[i] = Integer.parseInt(stk.nextToken());
        }

        stk = new StringTokenizer(br.readLine()," ");
        int[] lockPassword2 = new int[3];
        for (int i=0;i<3;i++){
            lockPassword2[i] = Integer.parseInt(stk.nextToken());
        }

    
        int cnt =0;
        for (int i =1; i<=n;i++){
            for(int j = 1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    if (((Math.abs(i-lockPassword1[0])<=2 || Math.abs(i-lockPassword1[0])>=(n-2)) && (Math.abs(j-lockPassword1[1])<=2 || Math.abs(j-lockPassword1[1])>=(n-2)) && (Math.abs(k-lockPassword1[2])<=2 || Math.abs(k-lockPassword1[2])>=(n-2))) || ((Math.abs(i-lockPassword2[0])<=2 || Math.abs(i-lockPassword2[0])>=(n-2)) && (Math.abs(j-lockPassword2[1])<=2 || Math.abs(j-lockPassword2[1])>=(n-2)) && (Math.abs(k-lockPassword2[2])<=2 || Math.abs(k-lockPassword2[2])>=(n-2))))
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}