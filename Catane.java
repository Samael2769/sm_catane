import core.*;
import term.*;

public class Catane {
    public static void main(String [] args) {
        Core core = new Core();
        MapHandler term = new MapHandler();
        core.makeGame(19, 4);
        term.printMap(core);
    }
}
