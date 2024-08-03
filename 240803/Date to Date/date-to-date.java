import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int m1 = Integer.parseInt(stk.nextToken());
        int d1 = Integer.parseInt(stk.nextToken());
        int m2 = Integer.parseInt(stk.nextToken());
        int d2 = Integer.parseInt(stk.nextToken());

        int[] dates = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int dateCnt = 1;

        while(true){
            if(m1==m2 && d1 == d2)
                break;

            d1++;
            dateCnt++;
            if(d1>=dates[m1]){
                d1=0;
                m1++;
            }
        }

        System.out.println(dateCnt);
    }
}