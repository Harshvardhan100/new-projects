import java.util.Scanner;

public class precticeset_14_exception {
    public static void main(String[] args) {
        boolean flag=true;

        int [] marks =new int[4];
        marks[0]=56;
        marks[1]=32;
        marks[2]=7;
        marks[3]=88;
        Scanner sc=new Scanner(System.in);

        int i=0;
        int index;

        while(flag&&i<5){

            try {
                index=sc.nextInt();
                System.out.println("the value of index is :"+marks[index]);
                break;

            }
            catch(Exception e){
                System.out.println("invalid index");
            i++;
            }
        }
       if(i>=5) {
           System.out.println("index should be less than 6");
       }
    }
}
