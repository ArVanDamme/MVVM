package model;

import java.io.Serializable;
import java.util.Objects;

public class Taille implements Serializable {

    private int nbTailleDispo;
    private Size TAILLE_ENUM;

    public Taille(int nbTailleDispo, Size TAILLE_ENUM) {
        this.nbTailleDispo = nbTailleDispo;
        this.TAILLE_ENUM = TAILLE_ENUM;
    }

    public void increment() {
        this.nbTailleDispo++;
    }

    public void decrement() {
        this.nbTailleDispo--;
    }

    public int getNbTailleDispo() {
        return nbTailleDispo;
    }

    public void setNbTailleDispo(int nbTailleDispo) {
        this.nbTailleDispo = nbTailleDispo;
    }

    public Size getTAILLE_ENUM() {
        return TAILLE_ENUM;
    }

    public void setTAILLE_ENUM(Size TAILLE_ENUM) {
        this.TAILLE_ENUM = TAILLE_ENUM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Taille)) return false;
        Taille taille = (Taille) o;
        return TAILLE_ENUM == taille.TAILLE_ENUM;
    }

}
