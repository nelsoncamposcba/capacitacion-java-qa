package clase_4.tarea;

public class Automovil extends Vehiculo {
    private int numPuertas;


    public Automovil(String marca, String modelo, int anio, double precio, int numPuertas) {
        super(marca, modelo, anio, precio);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
