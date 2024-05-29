import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<Integer> xList = new ArrayList<Integer>();
        List<Integer> yList = new ArrayList<Integer>();
        
        for (int i=0;i<n;i++){
            StringTokenizer stk = new StringTokenizer(br.readLine()," ");
            xList.add(Integer.parseInt(stk.nextToken()));
            yList.add(Integer.parseInt(stk.nextToken()));
        }

        int minVal = Integer.MAX_VALUE;
        for (int i=1;i<n-1;i++) {
            List<Integer> tempXList = new ArrayList<>(xList);
            tempXList.remove(i);
            List<Integer> xList2 = tempXList;

            List<Integer> tempYList = new ArrayList<>(yList);
            tempYList.remove(i);
            List<Integer> yList2 = tempYList;
            int sumVal = 0;

            for (int j =0; j < n-2 ; j++) {
                sumVal += (Math.abs(xList2.get(j+1)-xList2.get(j))+Math.abs(yList2.get(j+1)-yList2.get(j)));
            }

            if (sumVal < minVal) {
                minVal = sumVal;
            }
        }

        System.out.println(minVal);
    }
}