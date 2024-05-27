import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            String order = stk.nextToken();
            
            switch(order) {
                case "push_back":
                    arrayList.add(Integer.parseInt(stk.nextToken()));
                    break;
                case "pop_back":
                    arrayList.remove(arrayList.size()-1);
                    break;
                case "size":
                    System.out.println(arrayList.size());
                    break;
                case "get":
                    System.out.println(arrayList.get(Integer.parseInt(stk.nextToken())-1));
                    break;
            }
        }
    }
}