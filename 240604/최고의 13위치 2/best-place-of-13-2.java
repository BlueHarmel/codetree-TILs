import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<List<Integer>> coinGrid = new ArrayList<>();
        for (int i =0; i<n;i++){
            StringTokenizer stk = new StringTokenizer(br.readLine()," ");
            List<Integer> coinGridRow = new ArrayList<Integer>();

            for (int j =0; j<n; j++) {
                coinGridRow.add(Integer.parseInt(stk.nextToken()));
            }
            coinGrid.add(coinGridRow);
        }
        /*
        회전이 불가능 하므로 첫번째 격자의 시작점을 기준으로 잡고
        그리드 내의 동전 갯수를 새 이중리스트에 저장
        */
        int sumVal1 = 0;
        int sumVal2 = 0;
        int maxSumVal = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            List<Integer> coinGridRow = coinGrid.get(i);
            for (int j =0; j<(n-2); j++) {
                sumVal1 = coinGridRow.get(j)+coinGridRow.get(j+1)+coinGridRow.get(j+2);
                for (int k =(j+5>=n && i+1<n)?i+1:i;k<n;k++){
                    coinGridRow = coinGrid.get(k);
                    for(int l =(j+5>=n && i+1<n)?0:j+3;l<n-2;l++){
                        sumVal2 = coinGridRow.get(l)+coinGridRow.get(l+1)+coinGridRow.get(l+2);
                        if ((sumVal1+sumVal2)>maxSumVal) {
                            maxSumVal=sumVal1+sumVal2;
                        }
                    }
                }
            }
        }
        System.out.println(maxSumVal);
    }
}