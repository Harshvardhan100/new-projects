import java.util.Scanner;
public class nested_try_catch {
    public static void main(String[] args) {
        int [] marks =new int[4];
        marks[0]=56;
        marks[1]=32;
        marks[2]=7;
        marks[3]=88;
        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        while(flag) {
            int s = sc.nextInt();
            try {
                System.out.println("welcome 2 nested try catch");

                try {
                    System.out.println("array index" + marks[s]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("level 2 Exception");
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println("exceptin level no 1");
            }
        }
        System.out.println("succcessful Excecute the program");
        }
}
