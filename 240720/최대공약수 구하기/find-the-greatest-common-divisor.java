import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        System.out.println(greatestCommonValue(n,m));
    }

    static int greatestCommonValue(int n, int m){
        int smallNum = n>m?m:n;
        int gcv=0;
        for (int i =smallNum;i>0;i--){
            if(n%i==0 && m%i==0){
                gcv = i;
                break;
            }
        }
        return gcv;
    }
}