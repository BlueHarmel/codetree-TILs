import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken()), m = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(br.readLine());
        int cnt = 0;

        for(int i =0;i<n;i++){
            int num = Integer.parseInt(stk.nextToken());
            if(num == m)
                cnt++;
        }

        System.out.println(cnt);
    }
}