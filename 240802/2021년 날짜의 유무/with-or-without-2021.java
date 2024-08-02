import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(stk.nextToken()),D = Integer.parseInt(stk.nextToken());

        System.out.println(isExist(M,D)?"Yes":"No");
    }

    public static boolean isExist(int m, int d){
        HashMap<Integer,Integer> monthMap = new HashMap<Integer,Integer>();
        monthMap.put(1,31);
        monthMap.put(2,28);
        monthMap.put(3,31);
        monthMap.put(4,30);
        monthMap.put(5,31);
        monthMap.put(6,30);
        monthMap.put(7,31);
        monthMap.put(8,31);
        monthMap.put(9,30);
        monthMap.put(10,31);
        monthMap.put(11,30);
        monthMap.put(12,31);
        
        return monthMap.get(m)>=d;
    }
}