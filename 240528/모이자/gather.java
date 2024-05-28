import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine()," ");
        List<Integer> humanList = new ArrayList<Integer>();
        for (int cnt = 0; cnt < n; cnt++){
            humanList.add(Integer.parseInt(stk.nextToken()));
        }

        int minVal = Integer.MAX_VALUE;
        int sumVal;
        for (int i = 0; i < n; i++) {
            sumVal = 0;
            for (int j = 0; j < n; j++) {
                sumVal+=(humanList.get(j)*(Math.abs(j-i)));
            }
            if (sumVal <= minVal) {
                minVal = sumVal;
            }
        }
        System.out.println(minVal);
    }
}