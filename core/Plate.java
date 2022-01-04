package core;

import java.util.ArrayList;
import java.util.List;

public class Plate {
    int id;
    int type;
    int value;
    ArrayList<Integer> playerids = new ArrayList<>();

    public Plate(int type, int value, int oldid) {
        this.id = oldid + 1;
        this.type = type;
        this.value = value;
    }

    public int getId() {
        return this.id;
    }

    public int getType() {
        return this.type;
    }

    public int getValue() {
        return this.value;
    }

    public List<Integer> getPlayers() {
        return this.playerids;
    }

    public void addPlayer(int id) {
        playerids.add(id);
    }
}
