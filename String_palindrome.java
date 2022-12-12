import java.util.*;
public class String_palindrome {
    public static void main(String[] args) {
        String  ori,reverse = "";
        Scanner sc=new Scanner(System.in);
           ori=sc.nextLine();
           int lenght=ori.length();
           for(int i=lenght-1;i>=0;i--){
               reverse=reverse+ori.charAt(i);

           }
if(ori.equals(reverse)){
    System.out.println(" Palinedrome");
}
else {
    System.out.println("Not a  Plinedrome");
}




    }

}
