import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(stk.nextToken()),n2 = Integer.parseInt(stk.nextToken());
        int[] arrN1 = new int[n1];
        int[] arrN2 = new int[n2];

        stk = new StringTokenizer(br.readLine());
        for(int i =0;i<n1;i++){
            arrN1[i]=Integer.parseInt(stk.nextToken());
        }
        stk = new StringTokenizer(br.readLine());
        for(int i =0;i<n2;i++){
            arrN2[i]=Integer.parseInt(stk.nextToken());
        }

        System.out.println(isSubArr(arrN1,arrN2)?"Yes":"No");
    }

    public static boolean isSubArr(int[] arr1, int[] arr2){
        for(int i =0; i<arr1.length-2;i++){
            int[] subArr = Arrays.copyOfRange(arr1,i,i+3);
            if(Arrays.equals(subArr,arr2)){
                return true;
            }
        }
        return false;
    }
}