package core;

public class GameObject {
    int plateid;
    int zone;
    boolean type;
    int playerid;

    public GameObject(int plateid, int zone, boolean type, int playerid) {
        this.plateid = plateid;
        this.zone = zone;
        this.type = type;
        this.playerid = playerid;
    }
}
