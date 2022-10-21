//parent class
class base{

    int x;
// getter-setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
//if you want to inherid base class to other class then you use "extend" key word
// parent class
class Determide extends base{
    int y;

// getter-setter

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class inheritance45 {
    public static void main(String[] args) {
        // base class object
        // you can access only base class
base a=new base();
a.setX(3);
        System.out.println(a.getX());


        //this is determine class
        // you can access both of class
Determide b=new Determide();
b.setY(6);
b.setX(8);
        System.out.println(b.getY());
        System.out.println(b.getX());

    }
}
