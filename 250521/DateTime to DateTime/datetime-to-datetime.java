import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        int endDate = (A*24*60 + B*60 + C);
        int startDate = (11*24*60 + 11*60 + 11);
        int answer = endDate-startDate<0?-1:endDate-startDate;
        System.out.println(answer);
    }
}