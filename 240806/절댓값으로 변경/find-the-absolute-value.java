import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] numArr = new int[n];
        for(int i =0;i<n;i++){
            numArr[i]=Integer.parseInt(stk.nextToken());
        }

        absoluteNum(numArr);

        for(int i : numArr){
            System.out.print(i + " ");
        }
    }

    public static void absoluteNum(int[] numArr) {
        for(int i =0;i<numArr.length;i++){
            if(numArr[i]<0)
                numArr[i] = -numArr[i];
        }
    }
}