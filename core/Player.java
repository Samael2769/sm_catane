package core;

import java.util.ArrayList;
import java.util.List;

public class Player {
    int points;
    int color;
    int nbroutes;
    int nbvillage;
    int nbressources;
    ArrayList<Integer> ressources = new ArrayList<Integer>();

    public Player(int color) {
        this.color = color;
        this.nbroutes = 1;
        this.nbvillage = 1;
        this.points = 2;
    }

    public int getColor() {
        return this.color;
    }

    public void changeColor(int color) {
        this.color = color;
    }

    public void addRoute(int nbroutes) {
        this.nbroutes += nbroutes;
    }

    public void addVillage(int nbvillage) {
        this.nbvillage += nbvillage;
    }

    public void addRessources(int nbressources, int type) {
        this.nbressources += nbressources;
        for(int i = 0; i < nbressources; ++i) {
            ressources.add(type);
        }
    }

    public int removeRessources(int nb, int type) {
        for (int i = 0; i < ressources.size(); ++i) {
            if (ressources.get(i) == type) {
                nbressources--;
                ressources.remove(i);
                nb--;
            }
            if (nb == 0)
                break;
        }
        if (nb > 0)
            return -1;
        return 0;
    }

    public int getPoints() {
        return this.points;
    }

    public int getNbRoutes() {
        return this.nbroutes;
    }

    public int getNbVillage() {
        return this.nbvillage;
    }

    public int getNbRessource() {
        return this.nbressources;
    }

    public List<Integer> getRessources() {
        return this.ressources;
    }

    public int getNbSpecress(int type) {
        int nb = 0;
    
        for (int ress : ressources) {
            if (ress == type)
                nb++;
        }
        return nb;
    }

    public void printRessources() {
        System.out.println(ressources);
    }
}
