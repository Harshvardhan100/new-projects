import java.util.Scanner;
public class prime_check {
    public static void main(String[] args) {
        int fl = 0;
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();

        if (f <= 1) {
            System.out.println("not a prime ");
        } else {
            for (int i = 2; i < f; i++) {
                if (f % i == 0) {
                    System.out.println("not a prime");
                    fl = 1;
                    break;
                }
            }
            if (fl == 0) {
                System.out.println("prime");
            }
        }


    }
}
