import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    static int n,k;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        k = Integer.parseInt(stk.nextToken());
        n = Integer.parseInt(stk.nextToken());

        choose(0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void choose(int calcNum){
        if(calcNum==n){
            for(int num:answer){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i =1;i<=k;i++){
            answer.add(i);
            choose(calcNum+1);
            answer.remove(answer.size()-1);
        }
    }
}