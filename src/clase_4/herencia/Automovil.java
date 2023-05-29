package clase_4.herencia;

public class Automovil extends Vehiculo {
    private int numPuertas;


    public Automovil(String marca, String modelo, int anio, int numPuertas){
        //new Vehiculo(marca, modelo, anio); --> Ya no sirve, porque heredamos el constructor
        //super() -> Llamamos al constructor de la clase Padre
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    public Automovil(String marca, String modelo, int numPuertas){
        //new Vehiculo(marca, modelo, anio); --> Ya no sirve, porque heredamos el constructor
        //super() -> Llamamos al constructor de la clase Padre
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
