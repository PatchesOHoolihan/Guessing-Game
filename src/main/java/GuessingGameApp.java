import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Please input a number between 1 and 10");
        Scanner input = new Scanner(System.in );
        int guess = input.nextInt();
        int numberOfAttempts = 0;



        if(guess == 7){
            System.out.println("Congratulations you have won!");
        } else{System.out.println("Sorry, you lose");}

        if (numberOfAttempts < 2)
            {
                numberOfAttempts++;
            System.out.println("You may attempt one more guess");
            guess = input.nextInt();
                if(guess == 7) {
                    System.out.println( "Congratulations you have won!" );
                } else{System.out.println("Sorry, you lose");}
        }




        if(guess ==0){
            System.out.println("Please input a number between 1 and 10 or enter -1 to exit the program.");
        }
    }

}
