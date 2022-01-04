package core;

import java.util.Random;

public class Core {
    Player[] players = new Player[4];
    GameObject[] objects = new GameObject[100];
    Plate[] plates = new Plate[100];
    int platenb;
    int playernb;

    public Core() {
        System.out.println("Making Core");
    }

    public void makeGame(int platenb, int playernb) {
        this.platenb = platenb;
        this.playernb = playernb;

        for (int i = 0; i < playernb; ++i) {
            players[i] = new Player(i);
        }
        for (int i = 0; i < platenb; ++i) {
            int nb = 0;
            int type = 0;

            if (i <= 11 && i != 6)
                nb = i + 1;
            else 
                nb = new Random().nextInt(12) + 1;
            if (nb == 7 || (nb == 1 && i != 0))
                nb++;
            if (i == 0)
                type = 0;
            else
                type = new Random().nextInt(4) + 1;
            plates[i] = new Plate(type, nb, i);
        }
    }

    public void printMapIds() {
        for (int i = 0; i < platenb; ++i) {
            System.out.print(plates[i].getValue());
            System.out.print(" -> ");
            System.out.println(plates[i].getType());
        }
    }

    public void printPlayers() {
        for (int i = 0; i < playernb; ++i) {
            System.out.println(players[i].getColor());
        }
    }

    public Player[] getPlayers() {
        return this.players;
    }

    public Plate[] getPlates() {
        return this.plates;
    }

    public GameObject[] getObjects() {
        return this.objects;
    }

    public int getPlayerNb() {
        return this.playernb;
    }

    public int getPlatesNb() {
        return this.platenb;
    }
}
