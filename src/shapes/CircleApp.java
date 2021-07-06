package shapes;
import util.Input;
import java.text.DecimalFormat;
public class CircleApp {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Input input = new Input();
        System.out.print("What is the radius of the circle: ");
        double radius = input.getDouble();
        System.out.println("The radius is " + radius);
        Circle circle = new Circle(radius);
        System.out.println("The area is : " + df.format(circle.getArea()));
        System.out.println("The circumference is: " + df.format(circle.getCircumference()));
    }
}
