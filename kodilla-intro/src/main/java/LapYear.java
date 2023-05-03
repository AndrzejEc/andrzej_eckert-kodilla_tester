public class LapYear   {
    public static void main(String[] args) {         // [2]
        int Year = 2025;
        System.out.println(Year); // [3]
        if (Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    System.out.println("przestępny");
                }
                else
                    System.out.println("nie przestępny");
            }
            else
                System.out.println("przestępny");
        }
        else
            System.out.println("nie przestępny");

    }
}
