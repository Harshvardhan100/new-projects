import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int rev = 0, reminder,num;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

for (; number != 0; number = number / 10) {
            reminder = number % 10;
            rev = rev * 10 + reminder;

        }
        System.out.println(rev);

        if (number ==rev) {
            System.out.println("the number is palindrome");

        }
        else{
            System.out.println("not a plindrome");
        }

    }



}
