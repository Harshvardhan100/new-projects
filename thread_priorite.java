
class mythrr extends Thread{

    public mythrr(String name){
        super(name);

    }

    public void run() {
        int i=0;
        while(i<16) {
            System.out.println("Thank you" + this.getName());
            i++;
        }
//        int s=0;
//        while (s<3) {
//            System.out.println("i am thread");
//            s++;
//        }


    }
}

public class 
class mythrr extends Thread{

    public mythrr(String name){
        super(name);

    }

    public void run() {
        int i=0;
        while(i<16) {
            System.out.println("Thank you" + this.getName());
            i++;
        }
//        int s=0;
//        while (s<3) {
//            System.out.println("i am thread");
//            s++;
//        }


    }
}

public class thread_priorites{
    public static void main(String[] args) {
        mythrr s =new mythrr("harsh");
        mythrr s2 =new mythrr("2 nikhil");
        mythrr s3 =new mythrr("3 falana");
        mythrr s4=new mythrr("c4nhotu");
        mythrr s5=new mythrr("5 ajay(most imp )");
        mythrr s6=new mythrr(" 6 mithlesh");
        s.setPriority(Thread.MIN_PRIORITY);
        s.start();
//s2.start();
        s3.setPriority(Thread.NORM_PRIORITY);
        s3.start();
        // s4.start();
        s5.setPriority(Thread.MAX_PRIORITY);
        s5.start();
        // s6.start();


    }

}

{
    public static void main(String[] args) {
        mythrr s =new mythrr("harsh");
        mythrr s2 =new mythrr("2 nikhil");
        mythrr s3 =new mythrr("3 falana");
        mythrr s4=new mythrr("c4nhotu");
        mythrr s5=new mythrr("5 ajay(most imp )");
        mythrr s6=new mythrr(" 6 mithlesh");
        s.setPriority(Thread.MIN_PRIORITY);
        s.start();
//s2.start();
        s3.setPriority(Thread.NORM_PRIORITY);
        s3.start();
        // s4.start();
        s5.setPriority(Thread.MAX_PRIORITY);
        s5.start();
        // s6.start();


    }

}

