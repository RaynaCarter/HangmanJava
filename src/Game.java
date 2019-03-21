import java.util.*;
import java.util.ArrayList;

public class Game {


    String[] states = {"alabama","alaska","arizona","arkansas","california","kentucky","louisiana",
            "west virginia","wisconsin","wyoming"};

    String answer= " ";
    String word = "";
    Boolean gameOver = false;

    ArrayList<String> guessedLetters = new ArrayList<String>();

    //////////////////

    public Game(){ //constructor
        getRandom();
        isGameOver();
    }

    //////////////////


    public void isGameOver(){

        if(!word.equals(answer)){
            gameOver.equals(true);
        }
    }

    //////////////////

    public void getRandom() {
        int index = new Random().nextInt(states.length);

        //System.out.println(word);
        word= states[index];
    }

    /////////////////

    public void handleGuessedLetters( String letter){
        if(!guessedLetters.contains(letter)){
            guessedLetters.add(letter);
        }else{
            System.out.println("YOU ALREADY GUESSED THIS LETTER");
        }

    }

    ////////////////////


    public void printWord(String x){
        answer="";

        for(int i=0;i< word.length();i++){
            String letter = word.substring(i,i+1);
            Boolean letterFound=false;

            if(word.equals(x)){
                System.out.println("YOU GUESSED CORRECTLY");
            }

            for(int m =0;m < guessedLetters.size();m++){
                //answer+= guessedLetters.get(m+1);

                    if (letter.equals(guessedLetters.get(m))) {

                        answer += guessedLetters.get(m);

                        letterFound = true;
                    }

            }


            if(letterFound==false){
                answer+="_ ";
            }



            if(word.equals(answer)){
                System.out.println("YOU GUESSED CORRECTLY!");
            }

        }

             System.out.println(answer);
             System.out.println(guessedLetters);



    }
}


