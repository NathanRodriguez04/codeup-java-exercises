package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;
    private int number;
    private double doubleNum;
    public Input(){
        this.scanner = new Scanner(System.in);
        this.number = number;
        this.doubleNum = doubleNum;
    }
    public String getString(){
        String message = "hello";
        return message;
    }
    public boolean yesNo(){
        System.out.print("Yes or Yes?: ");
        String answer = scanner.next().toLowerCase();
        if(answer.equals("y") || answer.equals("yes")){
            return true;
        }
        return false;
    }
    public int getInt(int min, int max){
        this.number = getInt();
        if(number < min){
            System.out.println("Please pick a number between " + min + " and " + max);
            getInt(min, max);
        } else if(number > max){
            System.out.println("Please pick a number between " + min + " and " + max);
            getInt(min, max);
        }
        return this.number;
    }
    public int getInt(){
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        return number;
    }
    public double getDouble(double min, double max){
        this.doubleNum = getDouble();
        if(doubleNum < min){
            System.out.println("Please pick a number between " + min + " and " + max);
            getDouble(min, max);
        } else if(doubleNum > max){
            System.out.println("Please pick a number between " + min + " and " + max);
            getDouble(min, max);
        }
        return this.doubleNum;
    }
    public double getDouble(){
//        System.out.print("Please enter a number with decimals: ");
        double doubleNum = scanner.nextDouble();
        return doubleNum;
    }
}