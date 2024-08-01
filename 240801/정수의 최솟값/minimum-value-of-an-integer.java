import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken()),b = Integer.parseInt(stk.nextToken()),c = Integer.parseInt(stk.nextToken());
        System.out.println(minVal(a,b,c));
    }

    static int minVal(int a, int b, int c){
        int minVal = Integer.MAX_VALUE;
        if(a<minVal){
            minVal=a;
        }
        if(b<minVal){
            minVal=b;
        }
        if(c<minVal){
            minVal=c;
        }
        return minVal;
    }
}