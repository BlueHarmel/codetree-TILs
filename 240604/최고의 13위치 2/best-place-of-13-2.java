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
        다음 줄이 존재하고, 두번째 격자의 마지막 지점이 row길이보다 큰 경우 다음 row부터 시작하도록 설정
        */
        int sumVal1 = 0;
        int sumVal2 = 0;
        int maxSumVal = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            List<Integer> coinGridRow = coinGrid.get(i);
            for (int j =0; j<(n-2); j++) {
                sumVal1 = coinGridRow.get(j)+coinGridRow.get(j+1)+coinGridRow.get(j+2);
                for (int k =(j+5>=n && i+1<n)?i+1:i;k<n;k++){
                    List<Integer> newCoinGridRow = coinGrid.get(k);
                    for(int l =(j+5>=n && i+1<n)?0:j+3;l<n-2;l++){
                        sumVal2 = newCoinGridRow.get(l)+newCoinGridRow.get(l+1)+newCoinGridRow.get(l+2);
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