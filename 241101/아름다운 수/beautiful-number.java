import java.io.*;
import java.util.*;

public class Main {

    static int n,ans;
    static ArrayList<Integer> seq=new ArrayList<>();

    public static boolean isBeautiful() {
        // 연달아 같은 숫자가 나오는 시작 위치를 잡습니다.
        for(int i = 0; i < n; i += seq.get(i)) {
            // 만약 연속하여 해당 숫자만큼 나올 수 없다면
            // 아름다운 수가 아닙니다.
            if(i + seq.get(i) - 1 >= n)
                return false;
            // 연속하여 해당 숫자만큼 같은 숫자가 있는지 확인합니다.
            // 하나라도 다른 숫자가 있다면
            // 아름다운 수가 아닙니다.
            for(int j = i; j < i + seq.get(i); j++)
                if(seq.get(j) != seq.get(i))
                    return false;
        }
        return true;
    }

    static void choose(int digit){
        if(digit == n){
            if(isBeautiful())
                ans++;
            return;
        }

        for(int i =1;i<=4;i++){
            seq.add(i);
            choose(digit+1);
            seq.remove(seq.size()-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        choose(0);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}