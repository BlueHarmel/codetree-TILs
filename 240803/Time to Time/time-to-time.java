import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int h2 = Integer.parseInt(stk.nextToken());
        int m2 = Integer.parseInt(stk.nextToken());
        
        int cntMin = 0;

        while(true) {
            if(h==h2 && m==m2)
                break;
            
            cntMin++;
            m++;
            if(m>=60){
                m=0;
                h++;
            }
        }

        System.out.println(cntMin);
    }
}