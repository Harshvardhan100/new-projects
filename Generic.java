import java.util.*;
class mygeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public mygeneric(int val, T1 t1 , T2 t2){
        this.val=val;
        this.t1=t1;
        this.t2=t2;

    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class Generic {
    public static void main(String[] args) {
        ArrayList s=new ArrayList();


        s.add("kgf 2");
        s.add(23);
        s.add(3454);

        System.out.println(s.get(0));


        mygeneric<String,Integer>g1=new mygeneric(23,"harshh : ",644);
        String str=g1.getT1();
        Integer int1=g1.getT2();
        System.out.println(str+int1);


    }

}
