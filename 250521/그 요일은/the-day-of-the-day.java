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

        int days1 = d1;
        for(int i =1;i<m1;i++){
            days1 += daysOfMonth[i];
        }

        for(int i =0;i<dates.length;i++){
            if(dates[i].equals(A)){
                days1 += i;
            }
        }

        int days2 = d2;
        for(int i =1;i<m2;i++){
            days2 += daysOfMonth[i];
        }

        System.out.println((days2-days1)/7+1);

    }
}