import java.awt.*;

public class Loops {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        int[] numbers = new int[] {1,3,5,11,66};
        System.out.println(sumNumbers(numbers));
    }
    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++){
            result=result+numbers[i];
        }
        return result;
    }
}
