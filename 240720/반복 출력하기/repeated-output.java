import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeatNum = Integer.parseInt(br.readLine());
        printString(repeatNum);
    }

    static void printString(int n){
        for(int i =0; i<n;i++){
            System.out.println("12345^&*()_");
        }
    }
}