abstract class parent1 {
//

    public void falani() {
        System.out.println("this idparent1 class methods falani");

    }

    abstract public void math2();
}

class child extends parent1{

   public void math2(){
        System.out.println("good night");
    }
}

 class child3 extends parent1{

   public void math2(){
        System.out.println("good evening");
    }


}


public class abstract_class {
    public static void main(String[] args) {
        parent1 ss = new child();

        // you cant make abstract class'object
        // if you want to make object then you should make
        // new class the inherid to abtract but abstract methos must be
        // there in both of class while abstract class'
        // in method be use abstcat keyword

      //  child3 kk=new child3();

    }

}
