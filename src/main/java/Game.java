import java.util.List;

public interface Game {
    void game(String player, List<String> actions);
    Boolean isWinCondition(String playerAction, String computerAction);
}
