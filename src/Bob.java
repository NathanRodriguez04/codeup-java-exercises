import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        System.out.println("Talk to bob!");

        Scanner sc = new Scanner(System.in);
        String conversation = sc.nextLine();


        if(conversation.endsWith("?")){
            System.out.println("Sure");
        }else if(conversation.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if(conversation.isEmpty()){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever.");
        }




    }
}