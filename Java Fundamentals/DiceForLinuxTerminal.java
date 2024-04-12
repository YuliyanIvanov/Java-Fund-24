import java.util.Random;
public class DiceForLinuxTerminal {

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

            System.out.println("Die 1:");
            printDie(result1);
            System.out.println("Die 2:");
            printDie(result2);

            int total = result1 + result2;
            System.out.println("Total: " + total);
        }

        public static void printDie(int value) {
            String[] lines = new String[5];
            lines[0] = "+-------+";
            lines[4] = "+-------+";

            switch (value) {
                case 1:
                    lines[1] = "|       |";
                    lines[2] = "|   *   |";
                    lines[3] = "|       |";
                    break;
                case 2:
                    lines[1] = "| *     |";
                    lines[2] = "|       |";
                    lines[3] = "|     * |";
                    break;
                case 3:
                    lines[1] = "| *     |";
                    lines[2] = "|   *   |";
                    lines[3] = "|     * |";
                    break;
                case 4:
                    lines[1] = "| *   * |";
                    lines[2] = "|       |";
                    lines[3] = "| *   * |";
                    break;
                case 5:
                    lines[1] = "| *   * |";
                    lines[2] = "|   *   |";
                    lines[3] = "| *   * |";
                    break;
                case 6:
                    lines[1] = "| * * * |";
                    lines[2] = "|       |";
                    lines[3] = "| * * * |";
                    break;
                default:
                    throw new IllegalArgumentException("Die value must be between 1 and 6");
            }

            for (String line : lines) {
                System.out.println(line);
            }
        }
    }
