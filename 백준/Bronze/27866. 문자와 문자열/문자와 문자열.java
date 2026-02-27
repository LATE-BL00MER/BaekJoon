import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        // String의 charAt() 메소드를 활용해 n-1번째 문자를 출력한다.
        System.out.println(s.charAt(n - 1));
    }
}
