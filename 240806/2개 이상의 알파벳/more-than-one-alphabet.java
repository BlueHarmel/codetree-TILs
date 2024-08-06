import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        System.out.println(isDiverse(a)?"Yes":"No");
    }

    public static boolean isDiverse(String a) {
        char prevChar=a.charAt(0);
        for(int i=1;i<a.length();i++){
            if(a.charAt(i)!=prevChar)
                return true;

        }
        return false;
    }
}