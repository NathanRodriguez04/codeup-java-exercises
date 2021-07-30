import java.util.Arrays;
import java.util.Scanner;

public class StringsLecture {
//    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
////        System.out.println("Print your name");
////        String input = scnr.next();
////        String randomName = "Grady";
////        if(input.equalsIgnoreCase(randomName)){
////            System.out.println("Hey that's my name!");
//
//
//        Scanner sc = new Scanner(System.in);
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//
//        System.out.println("Enter your name");
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//        String input = sc.next();
//        while (!input.equalsIgnoreCase(randomName)) {
//
//            randomNum = (int) (Math.random() * 28);
//            randomName = studentsArr[randomNum];
//            System.out.printf("%s \n", randomName);
//
//        }
//
//
//    }
    //    TODO: you are a sports manager. Prompt your client who is training
//     for a marathon how many miles they have to run today. You're the
//     coach, so you decide how many miles they ran that day. create a method that takes in how many miles that have left in training and simulate that they check in with you after every 2 miles. print out
//     how many miles they have left in training until they have 0 miles
//     left.

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("how many miles have you ran today?");

    int userMiles = sc.nextInt();

    checkMiles(userMiles);
    System.out.println("you dont have anymore miles left");
    }

    public static void checkMiles(int miles) {
if(miles > 0){
    System.out.printf("you still have %s miles left.\n",miles);
    miles -= 2;

    System.out.printf("Miles: %s\n",miles);
    checkMiles(miles);
}
    }


}


