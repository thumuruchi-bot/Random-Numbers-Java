import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(100);

        System.out.println("Random Number: " + number);
    }
}
