public class thebank {
    public static void main(String[] args) {
        System.out.println(bank(17,1999));
    }
    public static String bank(int age, double money){
        if (age > 16 && money >= 2000){
            return "see me in the bank";
        } else {
            throw  new NumberFormatException();
        }
    }
}
