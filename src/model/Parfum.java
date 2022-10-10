package model;

import java.util.ArrayList;
import java.util.List;

public class Parfum extends AbstractProduct {

    private List<String> fragrancesDisponibles = new ArrayList<>();

    public Parfum(String nom, double prix) {
        super(nom, prix);
    }

    public List<String> getFragrancesDisponibles() {
        return fragrancesDisponibles;
    }

    public void setFragrancesDisponibles(List<String> fragrancesDisponibles) {
        this.fragrancesDisponibles = fragrancesDisponibles;
    }

    public void ajouterFragrances(String s){
        fragrancesDisponibles.add(s);
    }

    public void supprimerFragrances(String s) {
        fragrancesDisponibles.remove(s);
    }
}
