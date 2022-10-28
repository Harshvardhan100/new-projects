public class finally_block {
//    public static int kkll(){
//        try {
//            int a = 56;
//            int b = 6;
//            int c = a / b;
//            return c;
//        }
//
//        catch(Exception e){
//            System.out.println(e);
//        }
//finally {
//            System.out.println("this is finally block");
//
//        }
//
//return 0;
//    }


    public static void main(String[] args) {
//   int s=  kkll();
//        System.out.println(s);
        int a=7;
        int b=9;
        while(true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("im finally"+b);
            }
            b--;
        }
        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("im finally block");
        }

    }
}
