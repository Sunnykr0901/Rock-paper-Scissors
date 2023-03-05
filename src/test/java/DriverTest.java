import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class DriverTest {
    private final String playerAction = "Rock";
    private final String computerAction = "Scissors";
    private static final Game game = new GameImpl();

    @Test
    public void isWinConditionTest() {
        assertTrue(game.isWinCondition(playerAction, computerAction));
    }

}
