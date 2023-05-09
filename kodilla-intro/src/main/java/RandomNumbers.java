import java.util.Random;

public class RandomNumbers {
    //private int[] tabNumbers;
    static int size = 0;
    static int[] numbers = new int[5000];
    //public RandomNumbers(){
    //    this.tabNumbers=new int[5000];
    //    this.size=0;
    //}

    public static void main(String[] args) {
        int tmp = 0;
        int sum =0;

        //int[] numbers = new int[5000];
        while (sum < 5000){
            tmp=getRandomNumber(31);
            sum=sum+tmp;
            addNumber(tmp);
            System.out.println(sum);
        }
        System.out.println("Minimalna wylosowana liczba to "+getMinRandomNumber());
        System.out.println("Maksymalna wylosowana liczba to "+getMaxRandomNumber());
    }

    public static int getRandomNumber(int max){
        int tmp;
        Random random = new Random();
        tmp = random.nextInt(max);
        return tmp;
    }

    public static void addNumber(int value){
        //this.tabNumbers[this.size]=value;
        numbers[size]=value;
        size++;
        //numbers[numbers.length]=value;
    }
    public static int getMinRandomNumber(){
        int tmpMin=30;
        for (int i = 0; i < size; i++) {
            if (tmpMin>=numbers[i]){
                tmpMin=numbers[i];
            }
        }
        return tmpMin;
    }
    public static int getMaxRandomNumber(){
        int tmpMax=0;
        for (int i = 0; i < size; i++) {
            if (tmpMax<=numbers[i]){
                tmpMax=numbers[i];
            }
        }

        return tmpMax;
    }

}
