import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a;
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i =0; i<n;i++){
            StringTokenizer stk = new StringTokenizer(br.readLine()," ");
            String command = stk.nextToken();
            switch(command) {
                case "push_front":
                    a = Integer.parseInt(stk.nextToken());
                    linkedList.addFirst(a);
                    break;

                case "push_back":
                    a = Integer.parseInt(stk.nextToken());
                    linkedList.addLast(a);
                    break;

                case "pop_front":
                    System.out.println(linkedList.pollFirst());
                    break;

                case "pop_back":
                    System.out.println(linkedList.pollLast());
                    break;

                case "size":
                    System.out.println(linkedList.size());
                    break;

                case "empty":
                    System.out.println(linkedList.isEmpty()?1:0);
                    break;

                case "front":
                    System.out.println(linkedList.peekFirst());
                    break;

                case "back":
                    System.out.println(linkedList.peekLast());
                    break;
            }
        }
    }
}