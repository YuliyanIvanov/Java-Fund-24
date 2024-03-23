package Lists_Exercise;

import java.util.*;

public class J06_Cards_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Инициализация на опашките за картите на двамата играчи
        Queue<Integer> player1Cards = new ArrayDeque<>();
        Queue<Integer> player2Cards = new ArrayDeque<>();

        // Вход от потребителя за картите на първия и втория играч
        String[] player1Input = scanner.nextLine()
                .split(" ");
        String[] player2Input = scanner.nextLine()
                .split(" ");

        for (String card : player1Input) {
            player1Cards.offer(Integer.parseInt(card));
        }
        for (String card : player2Input) {
            player2Cards.offer(Integer.parseInt(card));
        }

        // Игра, като се продължава докато едната от ръцете е празна
        while (!player1Cards.isEmpty() && !player2Cards.isEmpty()) {
            // Проверка дали опашката е празна
            int card1 = player1Cards.poll();
            int card2 = player2Cards.isEmpty() ? 0 : player2Cards.poll();

            // Определяне на победителя и добавяне на картите към неговата ръка
            if (card1 > card2) {
                player1Cards.offer(card1);
                player1Cards.offer(card2);
            } else if (card2 > card1) {
                player2Cards.offer(card2);
                player2Cards.offer(card1);
            }
        }

        // Определяне на победителя и отпечатване на резултата
        if (!player1Cards.isEmpty()) {
            int sum = player1Cards
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println("First player wins! Sum: " + sum);
        } else {
            int sum = player2Cards
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
