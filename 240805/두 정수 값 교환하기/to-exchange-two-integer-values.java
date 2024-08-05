import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

/*
Integer 은 Wrapper클래스 이지만 불변객체이다
int 값이 저장된 value 필드가 final 선언되어있어 상속불가, 바꿀 수 없다
따라서 가변 Wrapper클래스를 생성해 원하는 기능을 구현할 수 있다.
*/
class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        IntWrapper n = new IntWrapper(Integer.parseInt(stk.nextToken())), m = new IntWrapper(Integer.parseInt(stk.nextToken()));

        swap(n,m);
        System.out.println(n.value + " " + m.value);
    }

    public static void swap(IntWrapper n, IntWrapper m) {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }
}