import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken()), q = Integer.parseInt(stk.nextToken());
        int[] numArr = new int[n];

        stk = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            numArr[i]=Integer.parseInt(stk.nextToken());
        }

        for(int i =0;i<q;i++){
            solution(br.readLine(),numArr);
        }
    }

    public static void solution(String numbers,int[] numArr){
        StringTokenizer stk = new StringTokenizer(numbers);
        int choice = Integer.parseInt(stk.nextToken());

        switch(choice){
            case 1:
                int a = Integer.parseInt(stk.nextToken())-1;
                System.out.println(numArr[a]);
                break;
            case 2:
                int b = Integer.parseInt(stk.nextToken());
                int idx = 0;
                for(int i =0;i<numArr.length;i++){
                    if(numArr[i]==b){
                        idx = i+1;
                        break;
                    }
                }
                System.out.println(idx);
                break;
            case 3:
                int s = Integer.parseInt(stk.nextToken())-1, e = Integer.parseInt(stk.nextToken())-1;
                for(int i =s;i<=e;i++){
                    System.out.print(numArr[i]+" ");
                }
                break;
        }   
    }
}