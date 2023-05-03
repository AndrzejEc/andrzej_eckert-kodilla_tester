import java.util.Random;

public class WhileLoops{
    public static void main(String[] args){
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println(getCountOfRandomNumber(10));
    }
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
