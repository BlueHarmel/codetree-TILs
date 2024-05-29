import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> humanList = new ArrayList<Integer>();
        for (int i =0 ; i<n; i++) {
            humanList.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i<n; i++) {
            //처음에 이렇게 시도했을때, 리스트의 shallow copy라 ConcurrentModificationException발생
            //List<Integer> newSubList = humanList.subList(0,i);
            //서브리스트의 복사본을 만들어야 한다.
            List<Integer> newSubList = new ArrayList<Integer>(humanList.subList(0, i));
            List<Integer> newHumanList = new ArrayList<Integer>(humanList.subList(i, n));
            newHumanList.addAll(newSubList);

            System.out.println(newHumanList);
        }
    }
}