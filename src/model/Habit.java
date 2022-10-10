package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Habit extends AbstractProduct {

    public static final String HABIT_PROP_COULEUR = "dzdqzpdnqzdflaknc";

    private List<Couleur> couleursDisponibles = new ArrayList<>();
    private List<Taille> taillesDisponibles = new ArrayList<>();

    public Habit(String nom, double prix) {
        super(nom, prix);
    }

    public List<Couleur> getCouleursDisponibles() {
        return couleursDisponibles;
    }

    public void setCouleursDisponibles(List<Couleur> couleursDisponibles) {
        this.couleursDisponibles = couleursDisponibles;
    }

    public List<Taille> getTaillesDisponibles() {
        return taillesDisponibles;
    }

    public void setTaillesDisponibles(List<Taille> taillesDisponibles) {
        this.taillesDisponibles = taillesDisponibles;
    }

    public void ajouterTaille(Taille taille){
        if(!this.taillesDisponibles.contains(taille)) {
            taillesDisponibles.add(taille);
        } else {
            this.taillesDisponibles.get(this.taillesDisponibles.indexOf(taille)).increment();
        }
    }

    public void ajouterCouleur(Couleur couleur){
        if(!this.couleursDisponibles.contains(couleur)){
            couleursDisponibles.add(couleur);
        }
    }

}
