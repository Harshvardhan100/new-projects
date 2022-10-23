interface sampleinterface{
    void math1();
    void math2();
}

interface childsampleinterface extends sampleinterface{
    void math1();
    void math2();

}

class mysampleclass implements childsampleinterface{
  public   void math1(){
        System.out.println("im math1....");
    }
  public   void math2(){
        System.out.println("im math 2");
    }
   public void math3(){
        System.out.println("im math3 ");
    }
    public void math4(){
        System.out.println("im math 4");
    }


}





public class interface_to_inheritans {
    public static void main(String[] args) {
        mysampleclass h=new mysampleclass();
        h.math1();
        h.math2();
        h.math3();
        h.math4();


    }

}
