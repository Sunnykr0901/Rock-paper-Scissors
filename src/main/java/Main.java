import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);

        // initializing
        Player player = new Player(scanner.nextLine());
        Actions actions = new Actions();
        Driver driver = new Driver(player.getName(), actions.getActions());

        // starting the game
        driver.start();
    }
}