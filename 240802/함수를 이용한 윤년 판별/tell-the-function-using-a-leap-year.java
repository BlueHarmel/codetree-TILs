import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());

        System.out.println(isYoonnyeon(y));
    }

    public static boolean isYoonnyeon(int y) {
        if((y%100==0&&y%400!=0)||y%4!=0){
            return false;
        }
        return true;
    }
}