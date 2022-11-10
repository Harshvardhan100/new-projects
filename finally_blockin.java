public class finally_block {
  public static int kkll(){
       try {
            int a = 56;
           int b = 6;
            int c = a / b;
           return c;
        }

        catch(Exception e){
            System.out.println(e);
       }
finally {
            System.out.println("this is finally block");
      }
return 0;
   }
