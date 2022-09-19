import java.util.*;

public class try_catch_exception {
    public static void main(String[] args) {
        int [] marks =new int[4];
marks[0]=56;
        marks[1]=32;
        marks[2]=7;
        marks[3]=88;
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();


        System.out.println("ENTRE THE VALUE you want to divide by value ");
        int number=sc.nextInt();


        try{
            System.out.println("type a arrays index "+marks[s]);
            System.out.println("by value division by : "+marks[s]/number);
        }
        catch(ArithmeticException e){
            System.out.println(" ARITHE METIC some problem -0 ");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("arry index out of bound ");
            System.out.println(e);
        }

        catch(Exception e){
            System.out.println(" SOME OTHER problem");
            System.out.println(e);
        }
    }
}
