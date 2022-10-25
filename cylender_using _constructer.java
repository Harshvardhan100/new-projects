//cylender_using_constructer
class cylenderr{
    private int hight;
    private int radius;

    public cylenderr(int hight, int radius) {
        this.hight = hight;
        this.radius = radius;
    }
    public double surcufrence(){

        return  2*3.142*radius*hight+2*3.142*radius*radius;
        //or
        // return 2*Math.PI*radius*hight+2*Math.PI*radius*radius;
    }
    public double volume(){

        //return 3.142*radius*radius*hight;
        //or
        return Math.PI*radius*radius*hight;

    }
}
public class cylender_using_constructer {
    public static void main(String[] args) {

        cylenderr non=new cylenderr(6,5);
        System.out.println(non.surcufrence());
        System.out.println(non.volume());

    }
}
