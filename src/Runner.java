import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[]args){
        Scanner keyBoardInput = new Scanner(System.in);

        //ArrayList<String> guessedLetters = new ArrayList<String>();


        //Zoo tiger = new Zoo();
        //Tiger tigger = new Tiger("Tigger");
        //tigger.eat("meat");

        Game first= new Game();
        System.out.println("Welcome to Hangman!");
        System.out.println("Insert a guess");
        while(!first.gameOver){
            String letter = keyBoardInput.nextLine();
            first.handleGuessedLetters(letter);
            first.printWord(letter);
        }



    }
}



