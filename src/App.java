
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<String> names = new ArrayList<>();
    public static boolean isCycling = true;

    public static final Scanner scanner = new Scanner(System.in);


    public void addNames() {
        while (isCycling) {
            String newName = scanner.nextLine();

            if (newName.equals("stop")) {
                break;
            }


            names.add(newName);

            // printNames();

        }
    }

    public void printNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
