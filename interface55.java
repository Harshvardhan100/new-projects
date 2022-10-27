interface bycycle{
    int a=19;
    public void applybreak();
    public void speedup(int speed);

}
interface hornbycycle{
    void blowhorn();
    void newhorn();

}
interface race{
    void racelow();
    void racehigh();
}



class avoncycle implements bycycle,hornbycycle,race{

    public void applybreak(){
        System.out.println("pless break ");
    }

    public void speedup(int speed){
        System.out.println("speed.......");
    }

    //2nd interface
    public void blowhorn(){

     System.out.println("me hu na");
    }
   public void newhorn(){
       System.out.println("pi pi piii...pii");
    }

     public void racelow(){
         System.out.println("low race .....");
    }

       public void racehigh(){
            System.out.println("high race.......");
        }



}




public class interface55 {
    public static void main(String[] args) {

        avoncycle h=new avoncycle();

        //you can create propertes in interfaces
        
        //1st interface
        h.applybreak();
h.speedup(7);
//2nd interface

h.blowhorn();
h.newhorn();
//3rd interface

        h.racehigh();
        h.racelow();




        //you cont modify the properties in interface as they are  final
        //bycycle.a=45;
        //System.out.println(a);



        //important
        //you cant make interface object
        // if you want access interface the you build other class then implements a interface
        //kitne bhi ho sakte hai interface or kitne bhi implements kar sakte hai
    }
}
