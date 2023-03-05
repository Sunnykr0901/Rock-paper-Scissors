import java.util.List;
import java.util.Scanner;

public class GameImpl extends Logging implements Game {

    public void game(String player, List<String> actions) {
        System.out.println("Select the action from the action sets");
        int index = 0;
        while (index < actions.size()) {
            System.out.println(actions.get(index));
            index++;
        }

        Scanner scanner = new Scanner(System.in);
        String playerAction = scanner.nextLine();
        index = (int)(Math.random() * 3);
        String computerAction = actions.get(index);
        logger.info("Computer has chosen action: " + computerAction + " index: " + index);

        boolean isWin = isWinCondition(playerAction, computerAction);
        if (isWin) {
            logger.info(player + " has won");
        } else {
            logger.info(player + " has not won");
        }
    }
    
    public Boolean isWinCondition(String playerAction, String computerAction) {
        boolean isWin = true;
        if (playerAction.equals("Rock") && !computerAction.equals("Scissors")) {
            isWin = false;
        } else if (playerAction.equals("Scissors") && !computerAction.equals("Paper")) {
            isWin = false;
        } else if (playerAction.equals("Paper") && !computerAction.equals("Rock")) {
            isWin = false;
        }
        return isWin;
    }
}
