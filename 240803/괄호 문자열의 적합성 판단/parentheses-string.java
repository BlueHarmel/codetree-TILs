import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> gualhoStack = new Stack<Character>();

        String gualhos = br.readLine();
        String answer = "Yes";
        for(int i =0; i<gualhos.length();i++){
            char gualho = gualhos.charAt(i);
            switch(gualho) {
                case '(':
                    gualhoStack.push(gualho);
                    break;

                case ')':
                    if(!gualhoStack.isEmpty())
                        gualhoStack.pop();
                    else {
                        answer = "No";
                    }
                    break;
            }
        }
        if(!gualhoStack.isEmpty())
            answer = "No";
        System.out.println(answer);
    }
}