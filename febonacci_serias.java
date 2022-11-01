public class febonacci_serias {
    public static void main(String[] args) {
 // fabonacci -0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

        int a=0;
        int b=1;
        int v;
int i;
int sum=0;

        System.out.println(a);
System.out.println(b);

        for(i=2;i<10;i++){
v=a+b;
            System.out.println(v);
a=b;
b=v;


sum=sum+v;

        }


        System.out.print("\n\n\n sum of fibonacci :");
        System.out.println((sum+1));


    }
}
