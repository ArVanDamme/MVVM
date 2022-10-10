package viewmodel;

import javafx.beans.property.*;
import javafx.scene.paint.Color;
import model.Couleur;

public class CouleurVM {

    private Couleur model;

    /**
     * Quantité de rouge dans la couleur (0-255)
     */
    private final IntegerProperty red = new SimpleIntegerProperty();
    public int getRed() {return red.get();}
    public ReadOnlyIntegerProperty redProperty() {return red;}
    private void setRed(int red) {this.red.set(red);}

    /**
     * Quantité de vert dans la couleur (0-255)
     */
    private final IntegerProperty green = new SimpleIntegerProperty();
    public int getGreen() {return green.get();}
    public ReadOnlyIntegerProperty greenProperty() {return green;}
    private void setGreen(int green) {this.green.set(green);}

    /**
     * Quantité de bleu dans la couleur (0-255)
     */
    private final IntegerProperty blue = new SimpleIntegerProperty();
    public int getBlue() {return blue.get();}
    public ReadOnlyIntegerProperty blueProperty() {return blue;}
    private void setBlue(int blue) {this.blue.set(blue);}

    /**
     * La couleur a proprement parlé
     */
    private final ObjectProperty<Color> laCouleur = new SimpleObjectProperty<>();
    public Color getLaCouleur() {return laCouleur.get();}
    public ObjectProperty<Color> laCouleurProperty() {return laCouleur;}
    private void setLaCouleur(Color laCouleur) {this.laCouleur.set(laCouleur);}


    public CouleurVM(Couleur model) {
        this.model = model;

        this.green.set(model.getGreen());
        this.red.set(model.getRed());
        this.blue.set(model.getBlue());

        this.laCouleur.set(new Color(this.getRed()/255.,this.getGreen()/255.,this.getBlue()/255.,1));
    }
}
