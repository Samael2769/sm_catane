package term;
import core.*;
import java.util.Objects;

public class MapHandler {

    public void printMap(Core core) {
        char[] a = {'a', 'a'};
        Plate[] plates = core.getPlates();
        int k = 0;
        int len = 2;

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9*4+10; ++j)
                System.out.print("_");
            System.out.println("");
            for (int j = 0; j < 9*4 + 1; ++j) {
                if (j % 4 == 0)
                    System.out.print("|");
                if (j % 8 == 0 && (j < (9 * 4 + 1 - len * 4) && j >= len * 4)) {
                    System.out.print(plates[k].getValue());
                    ++k;
                } else
                System.out.print(" ");
            }
            if (i < 2)
                --len;
            else
                ++len;
            System.out.println("");
        }
    }
}
