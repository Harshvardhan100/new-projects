import java.util.*;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(67);
        l2.add(56);
        l2.add(99);

        l1.add(2);

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(2);
        l1.add(4);
        l1.addAll(0,l2);
        l1.add(0,4);
        l1.add(2,8);

        System.out.println(l1.contains(3));
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(2));

        //new function only linklist not a arraylist
        l1.addLast(45556);
        l1.addFirst(75675);




        System.out.println("array");
        l1.set(6,80);
//l1.clear();

        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}


