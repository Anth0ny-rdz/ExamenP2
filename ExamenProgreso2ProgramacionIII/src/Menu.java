import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Menu {
    List<Plato> platos = new ArrayList<>();
    List<Plato> platoporprecio = new ArrayList<>();
    int suma = 0;

    public Menu() {
        // Constructor de la clase
    }

    public void addPackage(Plato plato1) {
        platos.add(plato1);
        Collections.sort(platos);
    }

}
