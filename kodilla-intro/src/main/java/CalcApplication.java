import java.util.Arrays;

public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.counter);
        double area = calculator.circleArea(11);
        System.out.println("Area "+area);

        double p = Calculator.PI;
        System.out.println("Value of PI is constant: "+p);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}
