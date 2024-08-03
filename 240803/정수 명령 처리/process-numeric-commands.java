import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer stk = new StringTokenizer("");
        Stack<Integer> numStack = new Stack<Integer>();

        for(int i =0; i<n;i++){
            stk = new StringTokenizer(br.readLine());
            String order = stk.nextToken();

            switch(order){
                case "push":
                    numStack.push(Integer.parseInt(stk.nextToken()));
                    break;
                
                case "pop":
                    System.out.println(numStack.pop());
                    break;

                case "size":
                    System.out.println(numStack.size());
                    break;
                
                case "empty":
                    System.out.println(numStack.isEmpty()?1:0);
                    break;
                
                case "top":
                    System.out.println(numStack.peek());
                    break;
            }
        }
    }
}