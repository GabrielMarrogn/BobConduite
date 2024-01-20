import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 0; i< a; i++){
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(r1 + r2);
        }

        sc.close();
    }
}
