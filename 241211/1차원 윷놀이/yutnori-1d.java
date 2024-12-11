import java.io.*;
import java.util.*;
/*
    적절하게 선택해 얻을 수 있는 점수를 최대로 하는 프로그램을 작성하라

*/
public class Main {
    static int n,m,k,maxScore=Integer.MIN_VALUE;
    static int[] pos,turn;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 턴의 횟수
        m = Integer.parseInt(st.nextToken()); // 윷놀이 판의 길이
        k = Integer.parseInt(st.nextToken()); // 말의 갯수

        pos = new int[k];

        turn = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            turn[i]=Integer.parseInt(st.nextToken());
        }

        backtracking(0,0);

        bw.write(String.valueOf(maxScore));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void backtracking(int depth,int currScore){
        if(depth == n){
            maxScore = Math.max(currScore,maxScore);
            return;
        }

        for(int i=0;i<k;i++){
            if(pos[i]>=m){
                continue;
            }

            pos[i]+=turn[depth];
            if(pos[i]>=m){
                currScore++;
            }
            backtracking(depth+1,currScore);
        }
    }
}