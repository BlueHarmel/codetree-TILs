import java.util.*;
import java.io.*;

// 승리조건 : 가로,세로,대각선으로 5개가 연속해서 놓인경우
// 검은색이 승리했는지 (1), 흰색이 이겼는지(2), 승부가 결정되지 않았는지(0)를 판단해야함
// 첫째줄에 승리 여부, 둘째줄에 연속된 5개의 바둑알 중 3번째 바둑알의 가로,세로 좌표
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        List<List<Integer>> gameBoard = new ArrayList<>();

        for (int i =0; i<19;i++) {
            List<Integer> gameBoardRow = new ArrayList<>();
            StringTokenizer stk = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j<19;j++) {
                gameBoardRow.add(Integer.parseInt(stk.nextToken()));
            }
            gameBoard.add(gameBoardRow);
        }
        
        /*
        왼쪽 위에서 부터 순서대로 확인하므로
        좌하단,하단,우하단,우측 방향으로 연속되는 경우가 있는지 확인하면 됨
        */
        int player=0;
        int xVal=0;
        int yVal=0;

        Loop1 : 
        for (int i =0; i<19; i++) {
            for (int j = 0; j<19; j++) {
                player = gameBoard.get(i).get(j);
                if (player!=0) {
                    int cnt1 = 0;
                    int cnt2 = 0;
                    int cnt3 = 0;
                    int cnt4 = 0;

                    if(j <=14){
                        for(int k = 0; k<5;k++) {
                            if (gameBoard.get(i).get(j+k)==player) {
                                cnt1++;
                                if(cnt1 >= 5){
                                    xVal = j+k-2;
                                    yVal = i;
                                    break Loop1;
                                }
                            }
                        }
                    }
                    if(i <= 14){
                        for(int k = 0; k<5;k++) {
                            if (gameBoard.get(i+k).get(j+k)==player) {
                                cnt2++;
                                if(cnt2 >= 5){
                                    xVal = j+k-2;
                                    yVal = i+k-2;
                                    break Loop1;
                                }
                            }
                        }
                    }
                    if(i <= 14 && j<=14){
                        for(int k = 0; k<5;k++) {
                            if (gameBoard.get(i+k).get(j)==player) {
                                cnt3++;
                                if(cnt3 >= 5){
                                    xVal = j;
                                    yVal = i+k-2;
                                    break Loop1;
                                }
                            }
                        }
                    }
                    if(i<=14 && j>=4){
                        for(int k = 0; k<5;k++) {
                            if (gameBoard.get(i+k).get(j-k)==player) {
                                cnt4++;
                                if(cnt4 >= 5){
                                    xVal = j-k+2;
                                    yVal = i+k-2;
                                    break Loop1;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(player);
        if(player != 0){
            System.out.println((yVal+1) + " " + (xVal+1));
        }
    }
}