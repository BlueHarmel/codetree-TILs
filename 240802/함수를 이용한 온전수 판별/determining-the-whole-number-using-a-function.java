import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {     
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken()),b = Integer.parseInt(stk.nextToken());

        int cnt = 0;
        for(int i =a;i<=b;i++){
            if(isOnjeon(i))
                cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean isOnjeon(int n){
        return n%2==0 || n%10==5 || (n%3==0 && n%9!=0)?false:true;
    }
}