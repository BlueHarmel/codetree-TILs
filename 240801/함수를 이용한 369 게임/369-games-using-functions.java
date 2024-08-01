import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a=Integer.parseInt(stk.nextToken()),b = Integer.parseInt(stk.nextToken());

        System.out.println(cntNum(a,b));
    }

    public static int cntNum(int a, int b){
        int sumVal = 0;

        for(int i=a;i<=b;i++){
            if(isValid(i)){
                sumVal++;
            }
        }
        return sumVal;
    }

    public static boolean isValid(int n){
        return n%3==0||(n+"").contains("3")||(n+"").contains("6")||(n+"").contains("9")?true:false;
    }
}