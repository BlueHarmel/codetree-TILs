import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken()), b = Integer.parseInt(stk.nextToken());

        int cnt = 0;
        for(int i =a;i<=b;i++){
            if(isValid(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isValid(int n){
        return isPrime(n)&&isEven(n)?true:false;
    }

    public static boolean isPrime(int n){
        for(int i =2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static boolean isEven(int n){
        int sum = 0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        
        return sum%2==0?true:false;
    }
}