import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame{

    public static void main(String args[]){

        int answer , guess;
        final int MAX = 100;

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        answer = rand.nextInt(MAX) + 1;

        System.out.println("Guess a number between 1 and 100: ");
            guess = keyboard.nextInt();
        
        if(guess == answer){
            System.out.println("You are win,Good job,The number was " + answer);
        }
        else{
            System.out.println("ohh! Sorry, but The number was " + answer);
        }





    }
}