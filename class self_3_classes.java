

class bas1{
    private int x;
    bas1(){
        System.out.println("im a base class constructer");
    }
    bas1(int a){
        System.out.println("im a base class overloaded constructer");
    }
}
class bus1 extends bas1{

    private int y;
    bus1(){
        System.out.println("im a bus class constructer");
    }
}
class three extends bus1{

    three(){
        System.out.println(" im three class constructer");
    }

}





public class self_3_classes {
    public static void main(String[] args) {

        // bas1 b=new bas1(4);
        //bus1 c=new bus1();
        three d=new three();


    }
}
