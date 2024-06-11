import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(stk.nextToken());

        int m = Integer.parseInt(stk.nextToken());

        String bread = br.readLine();

        LinkedList<Character> breadList = new LinkedList<>();

        for (char c : bread.toCharArray()){
            breadList.add(c);
        }

        ListIterator<Character> breadListIt = breadList.listIterator(breadList.size());

        for (int i =0 ; i<n ; i++){
            String commandLine = br.readLine();
            char command = commandLine.charAt(0);
            switch (command) {
                case 'L':
                    if(breadListIt.hasPrevious())
                        breadListIt.previous();
                    break;
                case 'R':
                    if(breadListIt.hasNext())
                        breadListIt.next();
                    break;
                case 'P':
                    char newBread = commandLine.charAt(2);
                    breadListIt.add(newBread);
                    break;
                case 'D':
                    if(breadListIt.hasNext()){
                        breadListIt.next();
                        breadListIt.remove();
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : breadList){
            sb.append(c);
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
}