import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int totalDays1 = d1;
        for(int i =0;i<m1-1;i++){
            totalDays1+=daysOfMonth[i];
        }

        int totalDays2 = d2;
        for(int i =0;i<m2-1;i++){
            totalDays2+= daysOfMonth[i];
        }

        System.out.println(totalDays2 - totalDays1+1);
    }
}