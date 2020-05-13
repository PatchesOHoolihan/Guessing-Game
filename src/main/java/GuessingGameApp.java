import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Please input a number between 1 and 10 to guess, 0 for further instruction, or -1 to exit the program");
        Scanner input = new Scanner(System.in );
        int guess = input.nextInt();
        int numberOfAttempts = 0;
        Random rnd = new Random( );
        int correctGuess = rnd.nextInt(10+1);
       // System.out.print(correctGuess);


        if (guess == 0){
            System.out.println("Please enter a number between 1 and 10, or you may enter -1 to exit the program");
            guess =input.nextInt();
        }
            if (guess == -1) {
                System.exit( 0 );
            }
//         if(guess == 7){
//            System.out.println("Congratulations you have won!");
//        }

        while (numberOfAttempts < 1 && guess != 0) {
            numberOfAttempts++;
//            guess = input.nextInt();

            if (guess == correctGuess) {
                System.out.println( "Congratulations you have won!" );
                    break;}
               else  if (guess < correctGuess) {
                System.out.println( "Your guess is too low, you may attempt one more guess" );
                guess = input.nextInt();
            } else if (guess > correctGuess) {
                System.out.println( "Your guess is too high, you may attempt one more guess" );
                    guess = input.nextInt();
            }
               if (guess == correctGuess){
                System.out.println( "Congratulations you have won!");}
                else if ( guess != 7){ System.out.println("Sorry, you lose");}

            }






        }
    }


