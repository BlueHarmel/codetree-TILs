import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(isYes(n));
    }

    static String isYes(int n){
        return (n%2==0&&(n/10+n%10)%5==0)?"Yes":"No";
    }
}