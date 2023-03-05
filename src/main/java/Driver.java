import java.util.List;
import java.util.Scanner;
public class Driver extends Logging {

    private final String playerName;
    private final List<String> actions;

    public Driver(String playerName, List<String> actions) {
        this.playerName = playerName;
        this.actions = actions;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        // if player wants to exit
        boolean isExit = true;
        int count = 0;

        // play the game, until player wants to exit
        while(isExit) {
            System.out.println("Want to play the game, press anything else press 0 to exit");
            String answer = scanner.nextLine();
            if (!answer.equals("0")) {
                count++;
                new GameImpl().game(playerName, actions);
                logger.info("Game " + count + " completed");
            } else {
                logger.info("Exiting from the session");
                isExit = false;
            }
        }
        logger.info("Total games played " + count);
    }
}
