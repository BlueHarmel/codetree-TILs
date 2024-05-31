import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        조건
        1. 최댓값이 되는 3개 숫자의 합 구하기
        2. carry가 발생하는가
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        List<Integer> numberList = new ArrayList<Integer>();
        for (int i =0; i<n;i++) {
            numberList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numberList, Collections.reverseOrder());

        int answer = 0;
        for (int i = 0; i<n-2; i++) {
            for (int j = i+1; j<n-1; j++) {
                //carry 발생여부 확인 후 합계 계산
                int num1 = numberList.get(i);
                int num2 = numberList.get(j);

                if (!isCarry(num1, num2)) {
                    int tempSum = num1+num2;
                    for (int k = j+1; k<n; k++) {
                        int num3 = numberList.get(k);
                        if(!isCarry(tempSum,num3)) {
                            answer = tempSum + num3;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }

    static boolean isCarry(int num1, int num2) {
        int n1 = String.valueOf(num1).length();
        int n2 = String.valueOf(num2).length();
        
        int smallNum = n1>n2?n2:n1;
        // System.out.println(num1 + " " + num2);

        for (int i = 0; i<smallNum ; i++) {
            int val1 = num1 % 10;
            int val2 = num2 % 10;
            if ((val1 + val2)>=10) {
                return true;
            }

            if (num1>10 && num2>10){
                num1 /= 10;
                num2 /= 10;
            } else {
                break;
            }
        }
        return false;
    }
}