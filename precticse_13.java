class ttmyt extends Thread{
    public void run() {
int a=2;

        while (a<78) {
            System.out.println("good morning");

                a++;
            }
    }
}
class ttmytt  extends Thread {
    public void run() {

        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
//                    e.printStackTrace();
                System.out.println(e);
            }
            System.out.println("welcome");
        }
    }
}
public class precticse_13 {
    public static void main(String[] args) {
ttmyt h=new ttmyt();
ttmytt j=new ttmytt();

// if you want to setpriority and getpriority
h.setPriority(8);
j.setPriority(3);
        System.out.println(h.getPriority());
        System.out.println(j.getPriority() );
            System.out.println(j.getState());


        // even if you want to  state - new
      //  System.out.println(j.getState());


h.start();


j.start();

        // even if you want to  state - RUNNABLE
       System.out.println(j.getState());

// if you want to current thread

        System.out.println(Thread.currentThread().getState());



    }
}

