import java.awt.*;
import java.util.SplittableRandom;

public class SimpleArray {
    public static void main(String[] args) {
        String[] friends = new String[] {"Grzesiek","Robert","Cyprian","Marek","Jarek"};
        String friend = friends[3];
        System.out.println(friend);
        int numberOfElements = friends.length;
        System.out.println(numberOfElements);
        System.out.println("Moja tablica zawiera "+numberOfElements+" elementów");
        for (int i =0; i < numberOfElements; i ++){
            System.out.println(friends[i]);
        }
        for (int  i = numberOfElements-1; i >=0; i --){
            System.out.println(friends[i]);
        }

    }

}
