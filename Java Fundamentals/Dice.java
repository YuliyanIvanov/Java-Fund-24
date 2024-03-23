import java.util.Random;

public class Dice {
    private static class Die {
        private final Random random;

        public Die() {
            this.random = new Random();
        }
        public int roll() {
            return random.nextInt(6) + 1;
        }
    }
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();

        System.out.println("Rolling two dice...");
        int result1 = die1.roll();
        int result2 = die2.roll();

        System.out.println("Die 1: " + result1);
        System.out.println("Die 2: " + result2);

        int total = result1 + result2;
        System.out.println("Total: " + total);
    }
}
