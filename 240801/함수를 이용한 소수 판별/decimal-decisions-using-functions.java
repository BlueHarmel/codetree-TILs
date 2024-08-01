import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken()),b = Integer.parseInt(stk.nextToken());

        System.out.println(sumAB(a,b));
    }

    public static int sumAB(int a, int b){
        int sumVal = 0;
        for(int i=a; i<=b;i++){
            if(isPrime(i)){
                sumVal+=i;
            }
        }
        return sumVal;
    }

    public static boolean isPrime(int n){
        for(int i =2; i<n;i++){
            if(n<2||n%i==0){
                return false;
            }
        }
        return true;
    }
}