import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        1.(A)

//        int i = 5;
//
//        while(i <= 15){
//
//            System.out.printf("i: %d\n", i);
//            i++;
//        }

//        (B)-1

//        int num = 0;
//
//        do{
//
//            System.out.printf("num is: %d\n", num);
//            num += 2;
//
//        }while(num <= 100);

//        (B)-2

//        int num = 100;
//        do{
//            System.out.printf("num is: %d\n", num);
//            num -= 5;
//
//        }while(num >= -5);

//        (B)-3

/* Due to the range of int the following sequence produced is
                    2
                    4
                    16
                    256
                    65536
                    0
And then it remains zero. Note that it never rises above 1000000.
With a long, the number after 65536 would be 4294967296
(which does not fit in an int, but does fit in a long), so it stops. */

//        long num = 2;
//
//        do{
//
//            System.out.printf("num is: %d\n", num);
//            num *= num;
//
//        }while(num < 1000000);

//        (C)

//        for(int i = 5; i <= 15; i++){
//            System.out.printf("i: %d\n", i);
//        }

//        for(int i = 2; i <= 100; i+=2){
//            System.out.printf("i: %d\n", i);
//        }

//        for(int i = 100; i >= -10; i-=5){
//            System.out.printf("i: %d\n", i);
//        }

//        for(long i = 2; i < 1000000; i*=i){
//            System.out.printf("i: %d\n", i);
//        }

//        2. FizzBuzz

//        for(int i = 1; i <= 100; i++){
//
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else {
//                System.out.printf("i: %d\n", i);
//            }
//        }

//        3. Table of powers

//        Scanner scanner = new Scanner(System.in);
//
//        while(true) {
//
//            System.out.println("What number would you like to go up to?");
//
//            int input = scanner.nextInt();
//
//            System.out.println("Here is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= input; i++) {
//
//                int squared = i * i;
//                int cubed = i * i * i;
//
//                System.out.println(i + "      | " + squared + "\t\t | " + cubed);
//            }
//
//            System.out.println("Would you like to continue? (y/n)");
//            String answer = scanner.next().toLowerCase();
//
//            if(answer.equals("y")) {
//                continue;
//            } else {
//                break;
//            }
//
//        }

//        4. Number to letter grades

//        while(true) {
//
//            System.out.println("Please enter a numerical grade from 0 to 100: ");

//        We are using byte for this example because we are assuming users will only input valid
//        numbers from 0-100 which fits inside of bytes range.

//            byte grade = scanner.nextByte();
//
//           if(grade >= 96) {
//               System.out.println("A+");
//           } else if(grade >= 92){
//               System.out.println("A");
//           } else if(grade >= 88){
//               System.out.println("A-");
//           } else if(grade >= 85){
//               System.out.println("B+");
//           } else if(grade >= 83){
//               System.out.println("B");
//           } else if(grade >= 80){
//               System.out.println("B-");
//           } else if(grade >= 75){
//               System.out.println("C+");
//           } else if(grade >= 71){
//               System.out.println("C");
//           } else if(grade >= 67){
//               System.out.println("C-");
//           } else if(grade >= 64){
//               System.out.println("D+");
//           } else if(grade >= 62){
//               System.out.println("D");
//           } else if(grade >= 60){
//               System.out.println("D-");
//           } else {
//               System.out.println("F");
//           }
//
//            System.out.println("Would you like to continue? (y/n)");
//            String prompt = scanner.next().toLowerCase();
//
//            if(prompt.equals("y")){
//                continue;
//            } else {
//                break;
//            }
//        }

    }
}