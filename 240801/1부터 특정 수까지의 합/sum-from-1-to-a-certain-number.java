import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        System.out.println(sumN(n));
    }

    static int sumN(int n) {
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum+=i;
        }
        return sum/10;
    }
}