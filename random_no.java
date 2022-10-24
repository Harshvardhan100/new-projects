import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int guess;
    public int noofguesses=0;

    public  int inputnumber;


    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }
 Game(){
        Random rand =new Random();
        this.number=rand.nextInt(100);
}

void takeuserinput(){
    System.out.println("Guess the number");
      Scanner sc=new Scanner(System.in);
      inputnumber=sc.nextInt();

    }
    boolean iscorrect(){
        noofguesses++;
        if(inputnumber==number){
            System.out.format("yes you guessed the numbet it was %d \n guesswed in %d attempt",number,noofguesses);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("too less");
                    }
        else if(inputnumber>number){
            System.out.println("too high");
        }
      return false;
    }
}











public class guess_the_number {
    public static void main(String[] args) {


        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b = g.iscorrect();
            System.out.println(b);
        }
    }
}
