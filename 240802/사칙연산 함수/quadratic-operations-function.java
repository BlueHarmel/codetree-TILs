import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken());
        char o = stk.nextToken().charAt(0);
        int c = Integer.parseInt(stk.nextToken());

        int answer = Integer.MIN_VALUE;
        switch(o) {
            case '-': 
                answer = minusNum(a,c);
                break;
            case '+': 
                answer = plusNum(a,c);
                break;
            case '/': 
                answer = divNum(a,c);
                break;
            case '*':
                answer = multiNum(a,c);
                break;
            default:
                break;
        }

        if(answer==Integer.MIN_VALUE){
            System.out.println("False");
        } else{
            System.out.println(a + " " + o + " " + c + " = " + answer);
        }
    }

    public static int plusNum(int a, int b){
        return a+b;
    }

    public static int minusNum(int a, int b){
        return a-b;
    }

    public static int multiNum(int a, int b){
        return a*b;
    }

    public static int divNum(int a, int b){
        return a/b;
    }
}