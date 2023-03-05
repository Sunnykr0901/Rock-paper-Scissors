import java.util.ArrayList;
import java.util.List;

public class Actions {
    private final List<String> actions = new ArrayList<>();
    public Actions() {
        this.actions.add("Rock");
        this.actions.add("Scissors");
        this.actions.add("Paper");
    }

    public List<String> getActions() {
        return actions;
    }
}
