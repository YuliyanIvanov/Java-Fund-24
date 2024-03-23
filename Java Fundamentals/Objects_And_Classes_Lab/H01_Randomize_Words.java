package Objects_And_Classes_Lab;

import java.util.*;

public class H01_Randomize_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<String> wordsList = new ArrayList<>(Arrays.asList(input));

        Collections.shuffle(wordsList);

        for (String word : wordsList){
            System.out.println(word);
        }
    }
}
