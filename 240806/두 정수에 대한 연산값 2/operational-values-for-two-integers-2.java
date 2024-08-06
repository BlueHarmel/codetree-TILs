import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        IntWrapper a = new IntWrapper(Integer.parseInt(stk.nextToken())), b = new IntWrapper(Integer.parseInt(stk.nextToken()));

        calcNums(a,b);

        System.out.println(a.value + " " + b.value);
    }

    public static void calcNums(IntWrapper a, IntWrapper b){
        if(a.value>b.value){
            a.value*=2;
            b.value+=10;
        } else {
            a.value+=10;
            b.value*=2;
        }
    }
}