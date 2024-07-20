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

        printStars(n,m);
    }

    static void printStars(int n,int m){
        for(int i =0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}