package viewmodel;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import model.Size;
import model.Taille;

public class TailleVM {

    private Taille model;

    private final IntegerProperty nbTailleDisponibles = new SimpleIntegerProperty();
        public IntegerProperty nbTailleDisponiblesProperty() { return nbTailleDisponibles; }
        public int getNbTailleDisponibles() { return nbTailleDisponibles.get(); }
        public void setNbTailleDisponibles(int nbTailleDisponibles) { this.nbTailleDisponibles.set(nbTailleDisponibles); }

    private final ObjectProperty<Size> taille_enum = new SimpleObjectProperty<>();
        public ObjectProperty<Size> taille_enumProperty() { return taille_enum; }
        public Size getTaille_enum() { return taille_enum.get(); }
        public void setTaille_enum(Size taille_enum) { this.taille_enum.set(taille_enum); }

    public TailleVM(Taille model) {
        this.model = model;
        this.nbTailleDisponibles.set(model.getNbTailleDispo());
        this.taille_enum.set(model.getTAILLE_ENUM());
    }
}
