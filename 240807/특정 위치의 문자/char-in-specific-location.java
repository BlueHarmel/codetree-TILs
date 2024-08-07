import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] charArr = {'L','E','B','R','O','S'};

        char c = br.readLine().charAt(0);

        for(int i=0;i<charArr.length;i++){
            if(c==charArr[i]){
                    System.out.println(i);
                    break;
                }
        }
    }
}