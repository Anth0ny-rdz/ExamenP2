import java.util.Collections;

public class Plato implements Comparable<Plato>{
String nombre;
double precio,calorias;

int tiempoprep;
public Plato(){
}
public Plato(String nombre,double precio,double calorias, int tiempoprep){
this.nombre = nombre;
this.precio = precio;
this.calorias = calorias;
this.tiempoprep = tiempoprep;
}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTiempoprep() {
        return tiempoprep;
    }

    public void setTiempoprep(int tiempoprep) {
        this.tiempoprep = tiempoprep;
    }
    public int compareTo(Plato otroPlato) {
        int comparedResult=nombre.compareTo(otroPlato.nombre);
        if(comparedResult>0){
            return 1;
        } else if (comparedResult<0) {
            return -1;
        } else {
            return 0;
        }
    }
@Override
public String toString(){
return "Plato{"+
        "nombre='" + nombre + '\'' +
        ", precio='" + precio + '\'' +
        ", calorias='" + calorias + '\'' +
        ", Tiempo ='" + tiempoprep + '\'' +

        '}';
}
}
