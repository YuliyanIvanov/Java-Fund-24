import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        names.add(scanner.nextLine());
        names.add("July");
        names.add("Desi");
        names.add("Maria");
        /*names.remove("Maria");*/

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.size());
    }
}
