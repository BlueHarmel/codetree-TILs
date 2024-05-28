import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binaryNum = br.readLine();

        for(int i=0; i<binaryNum.length();i++) {
            if (binaryNum.charAt(i)=='0') {
                StringBuilder sb = new StringBuilder(binaryNum);
                sb.setCharAt(i,'1');
                binaryNum = sb.toString();
                break;
            }
        }

        int answer = 0;
        for (int i=0;i<binaryNum.length();i++){
            answer += (Character.getNumericValue(binaryNum.charAt(i))*Math.pow(2,(binaryNum.length()-(i+1))));
        }
        System.out.println(answer);
    }
}