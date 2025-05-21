import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int[] daysOfMonth = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        String[] dates = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.

        int start = d1;
        for(int i =1;i<m1;i++){
            start += daysOfMonth[i];
        }

        int end = d2;
        for(int i =1;i<m2;i++){
            end += daysOfMonth[i];
        }

        int count = 0;
        for(int day = start; day <= end; day++) {
            int weekIdx = (day - start) % 7; // 0:월, 1:화, ..., 6:일
            if(dates[weekIdx].equals(A)) count++;
        }

        System.out.println(count);
    }
}