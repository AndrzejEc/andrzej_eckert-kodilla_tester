public class MyTest {
    public static void main(String[] args) {
        String example = "Hello from FirstClass!";
        System.out.println(example);
        int calculatedSum = sum(1,2);
        sumAndDisplay(1,2);
    }
    private static String sayHello() {
        String text = "Hello from FirstClass!";
        return text;
    }
    private static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
    private static void  sumAndDisplay(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}
