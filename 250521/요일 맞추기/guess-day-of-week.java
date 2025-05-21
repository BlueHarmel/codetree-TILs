import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int[] daysOfMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dates = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int totalDays1 = d1;
        for(int i =1;i<m1;i++){
            totalDays1 += daysOfMonth[i];
        }

        int totalDays2 = d2;
        for(int i =1;i<m2;i++){
            totalDays2 += daysOfMonth[i];
        }

        int index = (totalDays2-totalDays1)%7;

        System.out.println(index<0?dates[index+7]:dates[index]);
    }
}