import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        List<List<Character>> wordBoard = new ArrayList<>();
        for (int i =0;i<n;i++) {
            List<Character> wordBoardRow = new ArrayList<>();
            String line = br.readLine();
            for (int j = 0; j<m;j++) {
                wordBoardRow.add(line.charAt(j));
            }
            wordBoard.add(wordBoardRow);
        }
        
        int cnt = 0;
        // char이 L일때 모든 방향으로 EE 가 연속해서 나오는지 확인
        for (int i =0; i<n;i++){
            for (int j =0; j<m; j++) {
                if(wordBoard.get(i).get(j)=='L') {
                    //위쪽
                    if(i>=2 && wordBoard.get(i-1).get(j)=='E'&& wordBoard.get(i-2).get(j)=='E'){
                        cnt++;
                    }
                    //우상단
                    if(i>=2 && j<(m-2) && wordBoard.get(i-1).get(j+1)=='E'&& wordBoard.get(i-2).get(j+2)=='E'){
                        cnt++;
                    }
                    //우측
                    if(j<(m-2) && wordBoard.get(i).get(j+1)=='E'&& wordBoard.get(i).get(j+2)=='E'){
                        cnt++;
                    }
                    //우하단
                    if(i<(n-2) && j<(m-2) && wordBoard.get(i+1).get(j+1)=='E'&& wordBoard.get(i+2).get(j+2)=='E'){
                        cnt++;
                    }
                    //하단
                    if(i<(n-2) && wordBoard.get(i+1).get(j)=='E'&& wordBoard.get(i+2).get(j)=='E'){
                        cnt++;
                    }
                    //좌하단
                    if(i<(n-2) && j>=2 && wordBoard.get(i+1).get(j-1)=='E'&& wordBoard.get(i+2).get(j-2)=='E'){
                        cnt++;
                    }
                    //좌측
                    if(j>=2 && wordBoard.get(i).get(j-1)=='E'&& wordBoard.get(i).get(j-2)=='E'){
                        cnt++;
                    }
                    //좌상단
                    if(i>=2 && j>=2 && wordBoard.get(i-1).get(j-1)=='E'&& wordBoard.get(i-2).get(j-2)=='E'){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}