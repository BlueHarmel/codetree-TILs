import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());

        int a1=11,b1=11,c1=11;

        int minCnt = 0;

        while(true){
            if(a<11||(a==11 && b<11)||(a==11 && b == 11 && c<11)){
                minCnt=-1;    
                break;
            }
            if(a1==a&&b1==b&&c1==c)
                break;
            
            c1++;
            minCnt++;
            if(c1==60){
                c1=0;
                b1++;
            }
            if(b1==24){
                b1=0;
                a1++;
            }
        }

        System.out.println(minCnt);
    }
}