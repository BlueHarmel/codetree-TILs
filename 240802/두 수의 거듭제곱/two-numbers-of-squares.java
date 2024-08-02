import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken()),b = Integer.parseInt(stk.nextToken());

        System.out.println(powerNum(a,b));
    }

    public static int powerNum(int a, int b){
        int answer = 1;
        for(int i =0;i<b;i++){
            answer*=a;
        }
        return answer;
    }
}