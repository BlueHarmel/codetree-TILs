import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();

        System.out.println(palindrome(a).equals(a)?"Yes":"No");
    }

    public static String palindrome(String a) {
        String palindrome = "";
        for(int i =0;i<a.length();i++){
            palindrome += a.charAt(i);
        }
        return palindrome;
    }
}