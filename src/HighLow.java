import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        int random = randomNumber();

        userNumber(random);

    }

    public static int randomNumber(){

        Random rand = new Random();
        int upperbound = 100;
        // generate random values from 0-100

        int rando = rand.nextInt(upperbound);

        System.out.println("The random number: " + rando);

        return rando;
    }

    public static void userNumber(int random){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please pick a number between 1 and 100: ");
        int userInput = scanner.nextInt();

        if(userInput > 100){
            userNumber(random);
        } else if(userInput < 0){
            userNumber(random);
        }

        guess(random, userInput);

    }

    public static void guess(int random, int userNum){

        System.out.println("User number: " + userNum);

        if(userNum > random){
            System.out.println("LOWER");
            userNumber(random);
        } else if(userNum < random){
            System.out.println("HIGHER");
            userNumber(random);
        } else {
            System.out.println("THAT WAS A GOOD GUESS!");
        }

    }



}
