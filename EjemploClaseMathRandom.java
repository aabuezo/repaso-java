import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        // random de la clase Math
        double random = Math.random();
        System.out.println("random: " + random);
        System.out.println("random: " + random * 100);
        System.out.println("random: " + Math.round(random * 100));

        // clase Random
        Random randomObject = new Random();

        // random hasta cierto numero
        int randomInt = randomObject.nextInt(100);
        System.out.println("randomInt: " + randomInt);

        // random sin limite: pos o neg
        long ramdomLong = randomObject.nextLong();
        System.out.println("randomLong: " + ramdomLong);

        // random entre dos numeros
        int randomLowerUpper = randomObject.nextInt(10, 20);
        System.out.println("randomLowerUpper (entre 10 y 20): " + randomLowerUpper);
    }
}
