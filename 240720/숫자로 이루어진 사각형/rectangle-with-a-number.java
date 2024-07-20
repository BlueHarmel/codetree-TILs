import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        printSquare(n);
    }

    static void printSquare(int n){
        int cnt = 1;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(cnt==10){
                    cnt = 1;
                }
                System.out.print((cnt) + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}