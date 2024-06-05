import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine()," ");

        int[] lockPassword = new int[3];
        for (int i=0;i<lockPassword.length;i++){
            lockPassword[i]=Integer.parseInt(stk.nextToken());
        }
        
        int cnt=0;
        for (int i = 1; i<=n; i++){
            for (int j =1; j<=n;j++){
                for(int k=1;k<=n;k++){
                    if(Math.abs(k-lockPassword[2])<=2 || Math.abs(j-lockPassword[1])<=2 || Math.abs(i-lockPassword[0])<=2)
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}